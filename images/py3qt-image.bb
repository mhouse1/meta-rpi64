SUMMARY = "A PyQt5 development image"

require qt5-image.bb

IMAGE_LINGUAS = "en-us"

inherit image

DEPENDS += "bootfiles"

CORE_OS = " \
    firewall \
    ifupdown \
    iptables \
    kernel-modules \
    ntp \
    ntp-tickadj \
    openssh openssh-keygen openssh-sftp-server \
    packagegroup-core-boot \
    procps \
    rndaddtoentcnt \
    term-prompt \
    tzdata \
"

QT5_PKGS += " \
    python3-pyqt5 \
    pytouch \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${QT5_PKGS} \
"

# set_local_timezone() {
#     ln -sf /usr/share/zoneinfo/EST5EDT ${IMAGE_ROOTFS}/etc/localtime
# }

# disable_bootlogd() {
#     echo BOOTLOGD_ENABLE=no > ${IMAGE_ROOTFS}/etc/default/bootlogd
# }

# disable_rng_daemon() {
#     rm -f ${IMAGE_ROOTFS}/etc/rcS.d/S*rng-tools
#     rm -f ${IMAGE_ROOTFS}/etc/rc5.d/S*rng-tools
# }

# ROOTFS_POSTPROCESS_COMMAND += " \
#     set_local_timezone ; \
#     disable_bootlogd ; \
#     disable_rng_daemon ; \
# "

export IMAGE_BASENAME = "py3qt-image"
