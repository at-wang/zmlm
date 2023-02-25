import HelloWorld from '../components/HelloWorld.vue'
import test from "../components/test.vue";
import UserRecord from "../pages/userpage/UserRecord.vue";
import UserRecordSubscribe from "../pages/userpage/UserRecordSubscribe.vue";
import UserHomePage from "../pages/userpage/UserHomePage.vue";

const routes = [

    {
        name: '',
        path: '/',
        component: test
    },
    {
        name: '用户记录',
        path: '/userRecord',
        component: UserRecord
    },
    {
        name: '用户主页',
        path: '/userHomePage',
        component: UserHomePage
    },

];

export default routes
