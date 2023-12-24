# overview
an attempt to add mender to dunfell , currently the build returns error `Nothing PROVIDES 'bcm2835-bootfiles'`
i attempted to add  github.com/mirzak mender branch rpi-boot-part-update which includes some fixes but it looks like that fix is only applicable to the older sumo branch

so as of right now mender is not working.


## Warning
Currently only working with raspberrypi4 boards.

This layer depends on:

    URI: git://git.yoctoproject.org/poky.git
    branch: dunfell

    URI: git://git.openembedded.org/meta-openembedded
    branch: dunfell

    URI: https://github.com/meta-qt5/meta-qt5
    branch: dunfell

    URI: git://git.yoctoproject.org/meta-raspberrypi
    branch: dunfell

    URI: git://git.yoctoproject.org/meta-security.git
    branch: dunfell

    URI: https://github.com/jumpnow/meta-jumpnow.git
    branch: dunfell

Latest commits

    poky 6e89d66824
    meta-openembedded de37512b2
    meta-qt5 0d8eb95
    meta-raspberrypi 77190af
    meta-security c74cc97
    meta-jumpnow b399563

meta-rpi64 layer maintainer: M House <michaelhousera@gmail.com>
