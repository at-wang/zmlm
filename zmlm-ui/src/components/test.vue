<template>
<h1>从实打实打算</h1>
<el-button @click="test">{{data}}</el-button>
</template>

<script>


import {onMounted} from "vue";

export default {
  name: "test",
  methods:{
    test(){
      this.$http.post("http://localhost:8080",{
        "data":"!"
      })
    }
  },

}
</script>

<style scoped>

</style>