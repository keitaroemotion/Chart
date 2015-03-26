package com.sugano

import org.specs2.mutable.Specification
import java.awt.Graphics2D
import java.awt.geom.Rectangle2D
import java.awt.image.BufferedImage
import java.util.Calendar
import java.util.Date

import org.jfree.chart.{JFreeChart, ChartFactory}

import org.jfree.data.gantt.TaskSeries
import org.jfree.data.gantt.Task
import org.jfree.data.time.SimpleTimePeriod
import org.jfree.data.gantt.TaskSeriesCollection

/**
import org.jfree.chart.event.ChartChangeEvent
import org.jfree.chart.event.ChartChangeListener
import org.jfree.chart.labels.CategoryToolTipGenerator
import org.jfree.chart.labels.StandardCategoryToolTipGenerator
import org.jfree.chart.plot.CategoryPlot
import org.jfree.chart.renderer.category.CategoryItemRenderer
import org.jfree.chart.urls.CategoryURLGenerator
import org.jfree.chart.urls.StandardCategoryURLGenerator
import org.jfree.data.category.IntervalCategoryDataset
import org.junit.Before
import org.junit.Test
import org.junit.Assert.fail
import org.junit.Assert.assertEquals
import org.junit.Assert.assertSame
*/

class GanttSpec extends Specification {
  def createGanttChart():JFreeChart = {
    return ChartFactory.createGanttChart(
      "Gantt Chart",
      "Domain", "Range",
      null,
      true,
      true,
      true
    )
  }
  def supplyDestination():java.io.File = {
    new java.io.File("image.jpg")
  }

  def supplyImage(width:Int, height:Int):BufferedImage = {
    new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
  }

  def date(day:Int, month:Int, year:Int):Date = {
     var calendar = Calendar.getInstance();
     calendar.set(year, month, day);
     calendar.getTime();
 }


  def supplyDataSet() = {
    var series = new TaskSeries("Scheduled")
    series.add(new Task("task name",
      new SimpleTimePeriod(
       date(1, Calendar.APRIL, 2001), date(5, Calendar.APRIL, 2002)
      )
     )
    )
  }

 val FRAME_WIDTH = 1000
 val FRAME_HEIGHT = 500


  /**
      public void testDrawWithNullInfo2() {
        JFreeChart chart = createGanttChart();
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setDataset(createDataset());
        /* BufferedImage img =*/ chart.createBufferedImage(300, 200, null);
        //FIXME we should really assert a value
    }
  */

  "aaa" should {
    "test draw with null info" in {
      var chart = createGanttChart()
      var image = supplyImage(FRAME_WIDTH, FRAME_HEIGHT)
      var g2 = image.createGraphics()
      chart.draw(g2, new Rectangle2D.Double(0,0,FRAME_WIDTH,FRAME_HEIGHT), null, null)
      javax.imageio.ImageIO.write(image, "jpg", supplyDestination);
      g2.dispose()
      println("hihihi")
      "" == ""
    }
  }
}
