SUMMARY = "A console development image customized for the rpi"
HOMEPAGE = "http://www.mhouseos.com"

require images/basic-dev-image.bb

DEPENDS += "bootfiles"

WIFI = " \
    crda \
    iw \
    linux-firmware-rpidistro-bcm43455 \
    wpa-supplicant \
"

RPI_STUFF = " \
    userland \
"

IMAGE_INSTALL += " \
    firewall \
    ${RPI_STUFF} \
    ${WIFI} \
    ${SECURITY_TOOLS} \
    ${WIREGUARD} \
"

export IMAGE_BASENAME = "console-image"
