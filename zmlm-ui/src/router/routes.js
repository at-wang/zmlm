import HelloWorld from '../components/HelloWorld.vue'
import test from "../components/test.vue";
import UserRecord from "../pages/userpage/UserRecord.vue";
import UserRecordSubscribe from "../pages/userpage/UserRecordSubscribe.vue";
import UserHomePage from "../pages/userpage/UserHomePage.vue";
import UserMessage from "../pages/userpage/UserMessage.vue";
import UserMessageBody from "../pages/userpage/UserMessageBody.vue";

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

    {
        name: '用户消息',
        path: '/userMessage',
        component: UserMessage
    },
    {
        name: '1',
        path: '/test',
        component: UserMessageBody
    },

];

export default routes
