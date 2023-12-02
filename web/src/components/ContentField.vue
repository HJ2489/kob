<template>
<div class="container content-field">
    <div class="card">
        <div class="card-body">
            <!-- 未来要填充的都会渲染到slot区域内 -->
            <slot></slot> 
        </div>
    </div>
</div>
</template>

<script></script>

<style scoped>
div.content-field {
    margin-top: 20px;
}

</style>