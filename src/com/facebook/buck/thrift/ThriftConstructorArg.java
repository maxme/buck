/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.thrift;

import com.facebook.buck.rules.BuildRule;
import com.facebook.buck.rules.ConstructorArg;
import com.facebook.buck.rules.SourcePath;
import com.facebook.infer.annotation.SuppressFieldNotInitialized;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

@SuppressFieldNotInitialized
public class ThriftConstructorArg implements ConstructorArg {

  public String name;
  public ImmutableMap<SourcePath, ImmutableList<String>> srcs;
  public Optional<ImmutableSortedSet<BuildRule>> deps;

  public Optional<ImmutableList<String>> flags;

  public Optional<ImmutableSet<String>> javaOptions;

  public Optional<ImmutableSortedSet<BuildRule>> cppDeps;
  public Optional<ImmutableSortedSet<BuildRule>> cpp2Deps;
  public Optional<ImmutableSet<String>> cppOptions;
  public Optional<ImmutableSet<String>> cpp2Options;

  public Optional<ImmutableSet<String>> pyOptions;
  public Optional<String> pyBaseModule;

}