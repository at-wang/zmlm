import {defineConfig} from 'vite'
import ElementPlus from 'unplugin-element-plus/vite'

import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({

  plugins: [
    vue(),
    {
      plugins: [ElementPlus()],
    }
   /* ElementPlus({
      useSource: true,
    }),*/
  ],
  server: {
    proxy: {
      // 管理
      '/admin': {
        target: "",
        changeOrigin: true,
      },
      // 通用
      '/common': {
        target: "http://localhost:9801",
        changeOrigin: true,
      }

    }
  },


})