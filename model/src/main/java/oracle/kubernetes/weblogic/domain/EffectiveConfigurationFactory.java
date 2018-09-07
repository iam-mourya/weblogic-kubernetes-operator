// Copyright 2018, Oracle Corporation and/or its affiliates.  All rights reserved.
// Licensed under the Universal Permissive License v 1.0 as shown at
// http://oss.oracle.com/licenses/upl.

package oracle.kubernetes.weblogic.domain;

import oracle.kubernetes.weblogic.domain.v1.ServerSpec;

/**
 * The interface for the class used by the domain model to return effective configurations to the
 * operator runtime.
 */
public interface EffectiveConfigurationFactory {
  ServerSpec getAdminServerSpec();

  ServerSpec getServerSpec(String serverName, String clusterName);

  int getReplicaCount(String clusterName);

  void setReplicaCount(String clusterName, int replicaCount);
}
