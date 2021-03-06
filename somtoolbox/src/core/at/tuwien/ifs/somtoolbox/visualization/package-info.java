/*
 * Copyright 2004-2010 Information & Software Engineering Group (188/1)
 *                     Institute of Software Technology and Interactive Systems
 *                     Vienna University of Technology, Austria
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.ifs.tuwien.ac.at/dm/somtoolbox/license.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 Provides classes creating visualisations of trained SOMs. If you want to provide new visualisers, you have to implement
 the {@link at.tuwien.ifs.somtoolbox.visualization.BackgroundImageVisualizer} interface and register your visualisation in
 {@link at.tuwien.ifs.somtoolbox.visualization.Visualizations#getAvailableVisualizations()}.
 <br>
 If your visualisation requires user input to e.g. control parameters, extend {@link at.tuwien.ifs.somtoolbox.visualization.AbstractBackgroundImageVisualizer.VisualizationControlPanel} to add
 your specific control panel inputs.

 @see at.tuwien.ifs.somtoolbox.visualization.BackgroundImageVisualizer
 @see at.tuwien.ifs.somtoolbox.visualization.Visualizations
 @see at.tuwien.ifs.somtoolbox.visualization.AbstractBackgroundImageVisualizer
 */
package at.tuwien.ifs.somtoolbox.visualization;

