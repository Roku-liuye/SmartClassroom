import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginView from "@/views/LoginView.vue";
import ClassInfoView from "@/views/ClassInfoView.vue";
import commonView from "@/views/CommonView.vue";
import AboutView from "@/views/AboutView.vue";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'login',
    component: LoginView
  },
  {
    path: '/classInfo',
    name: 'classInfo',
    component: commonView,
    children: [{path: '', component: ClassInfoView}]
  },
  {
    path: '/about',
    name: 'about',
    component: commonView,
    children: [{path: '', component: AboutView}]
  },
]

const router = new VueRouter({
  routes
})

export default router
