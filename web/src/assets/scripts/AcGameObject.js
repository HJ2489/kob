const AC_GAME_OBJECTS = [];

export class AcGameObject {
    constructor() {
        AC_GAME_OBJECTS.push(this);
        this.timedelta = 0; // 当前帧执行的时刻距离上一帧的时间间隔
        this.has_called_start = false; // 表示是否执行过
    }

    start() { // 只执行一次
    }

    update() { // 每一帧执行一次，除了第一帧之外
    }

    on_destroy() { // 删除之前执行
    }

    destroy() {
        this.on_destroy();

        for(let i in AC_GAME_OBJECTS) {
            const obj = AC_GAME_OBJECTS[i];
            if(obj == this) {
                AC_GAME_OBJECTS.splice(i);
                break;
            }
        }
    }
}

let last_timetamp; // 上一次执行的时刻, timestamp是当前执行的时间
const step = timestamp => {
    // of是遍历值，in是遍历下标
    for(let obj of AC_GAME_OBJECTS) {
        if(!obj.has_called_start) {
            obj.has_called_start = true;
            obj.start();
        } else {
            obj.timedelta = timestamp - last_timetamp;
            obj.update();
        }
    }

    last_timetamp = timestamp;
    requestAnimationFrame(step)
}

requestAnimationFrame(step)