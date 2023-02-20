<template>
  <el-container style="background-color: #ffffff;width: 100%;height: 60px;border-bottom: 4px solid #f5f5f5">
<!--    <div class="header1">
      <img src="../image/tu1.png">
    </div>-->
    <div @click="test" class="header-span">
      发现
    </div>
    <div class="header-span2" @mouseenter="state.show=true" @mouseleave="state.show=false" >
      频道
    </div>
    <div class="header-span2">
      电台
    </div>

    <div class="header-input">
      <el-input v-model="input2" size="large" placeholder="专辑/声音/主播">
        <template #append><el-button style="background-color: #8c222c;width: 60px;height: 40px" type="primary" :icon="Search" /></template>
      </el-input>
    </div>
    <div class="header-avatal">
      <router-link to="/userRecord">
        <el-avatar style="margin-top: 5%" shape="square" :size="50" src="https://blog.csdn.net/weixin_60566467?spm=1001.2101.3001.5343" />
      </router-link>

    </div>
  </el-container>
  <transition name="el-zoom-in-top" >
    <div  @mouseenter="state.show=true"  @mouseleave="state.show=false" v-show="state.show" style="margin-left: 18%;background-color: #fbfbfc;width: 64%;height: 200px;position: absolute">
      <div class="zm-span" @click="test" v-for="data of 10" style="float: left;width: 20%;height: 10%;background-color: #ebebeb;text-align: center;margin-left: 5%;margin-top: 1%">
        <span >Info</span>
      </div>
    </div>
  </transition>

  <div   v-show="false" style="margin-left: 56%;background-color: #fbfbfc;width: 20%;height: 200px;position: absolute;border-top: 3px solid #8c222c">
    <div style="background-color: #1baeae;height: 50%;line-height: 100PX">
      <span style="margin-left: 10%">人字拖</span>

    </div>
    <div style="background-color: #f4e9ea;height: 50%">

    </div>
  </div>

<!--  <el-menu
      :default-active="activeIndex"
      class="el-menu-demo"
      mode="horizontal"
      @select="handleSelect"
  >
    <el-menu-item style="margin-left: 25%;height: 20%;position: relative" index="1">网</el-menu-item>
    <el-menu-item @mouseenter="state.show=true"  @mouseleave="state.show=false" >
      dada
    </el-menu-item>

&lt;!&ndash;      <el-menu-item index="2-1">item one</el-menu-item>
      <el-menu-item index="2-2">item two</el-menu-item>
      <el-menu-item index="2-3">item three</el-menu-item>
      <el-sub-menu index="2-4">
        <template #title>item four</template>
        <el-menu-item index="2-4-1">item one</el-menu-item>
        <el-menu-item index="2-4-2">item two</el-menu-item>
        <el-menu-item index="2-4-3">item three</el-menu-item>
      </el-sub-menu>&ndash;&gt;

    <el-menu-item index="3" disabled>Info</el-menu-item>
    <el-menu-item index="4">Orders</el-menu-item>
  </el-menu>
  <transition name="el-zoom-in-top" >
  <div  @mouseenter="state.show=true"  @mouseleave="state.show=false" v-show="state.show" style="margin-left: 25%;background-color: #fbfbfc;width: 50%;height: 200px;position: absolute">
    <div class="zm-span" @click="test" v-for="data of 10" style="float: left;width: 20%;height: 10%;background-color: #ebebeb;text-align: center;margin-left: 5%;margin-top: 1%">
      <span >Info</span>
    </div>
  </div>
  </transition>-->



</template>

<script  setup>
import {onMounted, reactive} from "vue";
import { Calendar, Search } from '@element-plus/icons-vue'

const state =reactive({
  show:false,
  search:''
})
const test = (e) => {

}
onMounted(()=>{
  //test()
})
</script>

<style scoped>
.zm-span:hover{
  color: crimson;
  cursor: pointer;
}
.header-img{
  margin-left: 23%;
}
.header-span{
  margin-left: 37%;
  width: 5%;
  height: 100%;
  text-align: center;
  line-height:60px;
  cursor: pointer;
}

.header-span2{

  width: 5%;
  height: 100%;
  text-align: center;
  line-height:60px;
  cursor: pointer;
}
.header-span:hover{
  background-color: #f4e9ea;
  border-bottom: 3px solid #8c222c;
}
.header-span2:hover{
  background-color: #f4e9ea;
  border-bottom: 3px solid #8c222c;
}
.header-input{
  width: 15%;
  line-height: 60px;
}
.header-avatal{
  width: 5%;
  height: 100%;
  cursor: pointer;
  margin-left: 10%;
}

</style>