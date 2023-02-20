<template>
  <div class="user-record">
    <!--标签头-->
    <div class="user-record-head">
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow1,'user-record-head-title-show':!state.style.headTitleShow1}">
        <span>订阅</span>
      </div>
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow2,'user-record-head-title-show':!state.style.headTitleShow2}"
           style="margin-left: 2%">
        <span>听过</span>
      </div>
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow3,'user-record-head-title-show':!state.style.headTitleShow3}"
           style="margin-left: 2%">
        <span>已购</span>
      </div>
      <div @click="changeTitleStyle"
           :class="{'user-record-head-title':state.style.headTitleShow4,'user-record-head-title-show':!state.style.headTitleShow4}"
           style="margin-left: 2%">
        <span>喜欢</span>
      </div>
    </div>
    <!--排序-->
    <div class="user-record-sort">
      <span style="font-size: 15px;line-height: 40px;color: #aaaaaa">排序</span>
      <span @click="changeSortStyle"
            :class="{'user-record-sort':state.style.userRecordSort1,'user-record-sort-show':!state.style.userRecordSort1}"
            style="font-size: 15px;margin-left: 3%;">最近更新</span>
      <span @click="changeSortStyle"
            :class="{'user-record-sort':state.style.userRecordSort2,'user-record-sort-show':!state.style.userRecordSort2}"
            style="font-size: 15px;margin-left: 3%;">最近订阅</span>
      <span @click="changeSortStyle"
            :class="{'user-record-sort':state.style.userRecordSort3,'user-record-sort-show':!state.style.userRecordSort3}"
            style="font-size: 15px;margin-left: 3%;">最近常听</span>
    </div>
    <!--分类-->
    <div class="user-record-category">
      <span style="font-size: 15px;line-height: 40px;color: #aaaaaa">排序</span>
    </div>
    <!--图片列表-->
    <div style="width: 100%;background-color: #1baeae" v-for="data of 10">
      <div style="width: 20%;float: left">
        <img alt="图片" style="width: 85%;border-radius: 10px" src="https://imagev2.xmcdn.com/group74/M02/2E/F8/wKgO0l6cMZ6Tg98GAAG8JNH9GPU032.jpg!strip=1&quality=7&magick=webp&op_type=3&columns=290&rows=290">
        <div style="width: 90%">
          <span class="user-record-category-span">测试曾打大大大大大算大苏打实打实</span>
        </div>
        <div  style="width: 85%;float: left">
          <span style="font-size: 10px;color: #a3a3ac;float: left;width: 60%">共100集</span>
          <span style="font-size: 10px;color: #666666;float: left;">😀</span>
        </div>
      </div>
    </div>
  </div>


</template>

<script setup>
import {onMounted, reactive} from "vue";


const state = reactive({
  style: {
    headTitleShow1: true,
    headTitleShow2: true,
    headTitleShow3: true,
    headTitleShow4: true,
    userRecordSort1: true,
    userRecordSort2: true,
    userRecordSort3: true,
  }

})
const test = (e) => {

}

//改选选中的样式
const changeTitleStyle = (e) => {
  if (e.target.innerText === '订阅') {
    state.style.headTitleShow1 = false;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = true;
  } else if (e.target.innerText === '听过') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = false;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = true;
  } else if (e.target.innerText === '已购') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = false;
    state.style.headTitleShow4 = true;
  } else if (e.target.innerText === '喜欢') {
    state.style.headTitleShow1 = true;
    state.style.headTitleShow2 = true;
    state.style.headTitleShow3 = true;
    state.style.headTitleShow4 = false;
  }
}

const changeSortStyle = (e) => {
  if (e.target.innerText === '最近更新') {
    state.style.userRecordSort1 = false;
    state.style.userRecordSort2 = true;
    state.style.userRecordSort3 = true;
  } else if (e.target.innerText === '最近订阅') {
    state.style.userRecordSort1 = true;
    state.style.userRecordSort2 = false;
    state.style.userRecordSort3 = true;
  } else if (e.target.innerText === '最近常听') {
    state.style.userRecordSort1 = true;
    state.style.userRecordSort2 = true;
    state.style.userRecordSort3 = false;
  }
}

onMounted(() => {

})
</script>

<style scoped>
.user-record {
  width: 45%;
  height: auto;
  min-height: 400px;
  margin-left: 20%;

}

.user-record-head {
  width: 100%;
  height: 60px;
  background-color: #ffffff;
}

.user-record-head-title {
  height: 60px;
  text-align: center;
  font-size: 20px;
  line-height: 60px;
  width: 10%;
  float: left;
}

.user-record-head-title-show {
  height: 60px;
  text-align: center;
  line-height: 60px;
  width: 10%;
  float: left;
  color: #8c222c;
  font-size: 22px;
  cursor: pointer;
  border-bottom: 3px solid #8c222c;
}

.user-record-head-title:hover {
  color: #8c222c;
  font-size: 22px;
  cursor: pointer;
  border-bottom: 3px solid #8c222c;
}

.user-record-sort {
  margin-top: 2%;
  width: 100%;
  height: 40px;
  background-color: white;
  border-bottom: 0.5px solid #efefef;
}

.user-record-category {
  margin-top: 2%;
  width: 100%;
  height: 40px;
  background-color: white;
}

.user-record-sort {
  color: #666666
}

.user-record-category-span {
  color: #40404c;
  font-size: 10px;
}

.user-record-category-span:hover {
  color: #8c222c;
  cursor: pointer;
}

.user-record-sort-show {
  color: #8c222c
}

.user-record-sort:hover {
  color: #8c222c;
  cursor: pointer;
}

</style>