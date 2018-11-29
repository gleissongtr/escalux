import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Ex01 from '@/components/Ex01'
import Input from '@/components/Input'
import Botoes from '@/components/Botoes'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/ex01',
      name: 'ex01',
      component: Ex01
    },
    {
      path: '/input',
      name: 'input',
      component: Input
    },
    {
      path: '/botoes',
      name: 'botoes',
      component: Botoes
    }
  ]
})
