<template>
  <div class="about">
    <el-form :inline="true" :model="formInline" class="demo-form-inline">
      <el-form-item label="教室位置">
        <el-input v-model="formInline.classroomLocation" placeholder="教室位置"></el-input>
      </el-form-item>

      <el-form-item label="教室状态">
        <el-select v-model="formInline.doorStatus" placeholder="请选择">
          <el-option
              v-for="item in emunDoor"
              :key="item.value"
              :label="item.label"
              :value="item.value">
          </el-option>
        </el-select>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="onSubmit">查询</el-button>
      </el-form-item>

    </el-form>

    <el-table
        :data="tableData"
        style="width: 100%">
      <el-table-column
          prop="classroomLocation"
          label="教室位置">
      </el-table-column>
      <el-table-column
          prop="temperature"
          label="温度">
      </el-table-column>
      <el-table-column
          prop="humidity"
          label="湿度">
      </el-table-column>
      <el-table-column
          prop="airQuality"
          label="空气质量">
      </el-table-column>
      <el-table-column
          prop="doorStatus"
          label="教室状态">
        <template slot-scope="scope">
          {{ scope.row.doorStatus === 0 ? '已关闭' : '已开启' }}
        </template>
      </el-table-column>
    </el-table>

    <el-pagination
        background
        :current-page.sync="pageNum"
        :page-size="pageSize"
        @current-change="changePageNum"
        layout="prev, pager, next"
        :total="total">
    </el-pagination>
  </div>
</template>

<script>

import {getClassInfoPage} from "@/api/app";

export default {
  name: 'ClassInfoView',
  data() {
    return {

      emunDoor: [{
        value: 0,
        label: '已关闭'
      }, {
        value: 1,
        label: '已开启'
      }],

      tableData: [],

      total: 0,
      pageNum: 1,
      pageSize: 6,

      formInline: {
        classroomLocation: '',
        doorStatus: ''
      }
    }
  },
  methods: {

    changePageNum(value) {
      this.pageNum = value;
      this.getPage();
    },

    getPage() {
      getClassInfoPage(this.formInline, this.pageNum, this.pageSize).then(res => {
        console.log(res)

        if (res.code === 2000) {
          this.tableData = res.data.list;
          this.total = res.data.total;
          this.pageSize = res.data.pageSize;
        }

      }).catch(err => {
        console.error('教室信息获取失败',err);
      })
    },

    onSubmit() {
      this.pageNum = 1
      this.getPage()
    }

  },
  created() {
    this.getPage().catch(err => {
      console.error('教室信息获取失败',err);
    })
  }
}
</script>
