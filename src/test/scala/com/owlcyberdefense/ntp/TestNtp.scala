package com.owlcyberdefense.ntp

import org.junit.AfterClass
import org.junit.Test

import org.apache.daffodil.tdml.Runner

object TestNtp {
  lazy val runner = Runner("/com/owlcyberdefense/ntp/", "TestNtp.tdml")

  @AfterClass def shutDown: Unit = {
    runner.reset
  }
}

class TestNtp {

  import TestNtp._

  @Test def test_ntp_01(): Unit = { runner.runOneTest("test_ntp_01") }
}
