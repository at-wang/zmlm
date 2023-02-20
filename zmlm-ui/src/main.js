import { createApp } from 'vue'

import './style.css'

//引入路由器
import router from './router/index.js'
import axios from "axios";

import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
//import '/element/style.scss'

import App from './App.vue'
const app = createApp(App);
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
/*app.use(ElementPlus)
app.use(axios)
app.use(router)
app.mount('#app')*/
app.config.globalProperties.$http = axios; // 关键语句
app.use(ElementPlus)
app.use(router).mount('#app')
