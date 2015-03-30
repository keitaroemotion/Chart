package com.sugano

import org.specs2.mutable.Specification

import org.jfree.chart.{JFreeChart, ChartFactory}
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.junit.Before;
import org.junit.Test;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;


class LineSpec extends Specification {

  "aaa" should {
    def createLineChart():JFreeChart = {
      var data = Array[Array[Double]](Array(4,1,3,2,5))
      var dataset = DatasetUtilities.createCategoryDataset("S", "C", data)
      return ChartFactory.createLineChart("Line Chart", "Domain", "Range", dataset)
    }


    "test draw with null info" in {
      //var chart = new JFreeChart()
      println("aaa")
      "" == ""
    }
  }
}
