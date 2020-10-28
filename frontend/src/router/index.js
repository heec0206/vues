import Vue from 'vue'
import VueRouter from 'vue-router'
import index from '@/views/index.vue'
import errPage from '@/views/errPage.vue'
import boardList from '@/views/boardList.vue'
import boardGalleryList from '@/views/boardGalleryList.vue'
import boardGalleryView from '@/views/boardGalleryView.vue'

Vue.use(VueRouter)

const routes = [
  { path: '/', name: 'index', component: index },
  { path: '*', redirect:'/404' },
  { path: '/404', name:'errPage', component:errPage },
  { path: '/boardGalleryList', name: 'boardGalleryList', component: boardGalleryList },
  { path: '/boardGalleryView/:seq', name: 'boardGalleryView', component: boardGalleryView },
  { path: '/boardList', name: 'boardList', component: boardList },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
