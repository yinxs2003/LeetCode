# ﻿inode磁盘清理


﻿硬盘有剩余空间但一直提示no device space left
使用df -hl查看磁盘还有空间 
使用df -i查看inode，发现占用率100%，说明碎片文件过多超过linux的文件数量的限制，使用如下命令查找碎片文件文件 
find / -xdev -printf '%h\n' | sort | uniq -c | sort -k 1 -n 
删除碎片文件