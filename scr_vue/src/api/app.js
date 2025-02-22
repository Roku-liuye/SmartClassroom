import {request} from "@/plugins/axios";

export function getClassInfoPage(data, pageNum, pageSize) {
    return request({
        url: `/classInfo/page?pageNum=${pageNum}&pageSize=${pageSize}`,
        method: 'post',
        data: data
    })
}