SUMMARY = "Qt5 test app"
HOMEPAGE = "http://www.mhouseos.com"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase"

SRCREV = "ea6ff0b6c316fb625fe3406f79821b0c8664bcd8"
SRC_URI = "git://github.com/scottellis/tspress.git"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/tspress ${D}${bindir}
}

FILES_${PN} = "${bindir}"

RDEPENDS_${PN} = "qtbase-plugins"
