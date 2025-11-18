package com.owlcyberdefense.ntp

// Copyright (c) 2012-2026 Owl Cyber Defense. All rights reserved.
// Please see the accompanying COPYRIGHT.txt file for terms of use.

import org.junit.AfterClass
import org.junit.Test

import org.apache.daffodil.tdml.Runner

//
// This test driver file is using a style that works from
// Daffodil version 3.4.0 to 4.0.0+
// 

object TestNtp {
  lazy val runner = Runner("/com/owlcyberdefense/ntp/", "TestNtp.tdml")

  @AfterClass def shutDown: Unit = {
    runner.reset()
  }
}

class TestNtp {

  import TestNtp._

  @Test def test_bits_01(): Unit = { runner.runOneTest("test_bits_01") }
  @Test def test_all_ff_01(): Unit = { runner.runOneTest("test_all_ff_01") }

  @Test def test_data_0(): Unit = { runner.runOneTest("test_data_0") }


}
