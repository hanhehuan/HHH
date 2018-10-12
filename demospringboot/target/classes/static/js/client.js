var $,tab;
layui.config({
    base : "../js/"
}).use(['bodyTab','form','element','layer','jquery'],function(){
    var form = layui.form,
        layer = layui.layer,
        element = layui.element;
    $ = layui.jquery;
    tab = layui.bodyTab({
        openTabNum : "50",  //最大可打开窗口数量
        url : "" //获取菜单json地址
    });

    $(".navBar ul li:first").trigger("click");
})

//打开新窗口
function addTab(_this){
    tab.tabAdd(_this);
}

