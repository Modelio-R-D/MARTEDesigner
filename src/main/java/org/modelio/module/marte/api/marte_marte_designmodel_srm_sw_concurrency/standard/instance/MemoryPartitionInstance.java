/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.instance.SwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MemoryPartition_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e679993f-7fac-4c25-a293-b34e7c47c858")
public class MemoryPartitionInstance extends SwResourceInstance {
    @objid ("dd3c6381-a001-4c63-b998-28ccbcb34f11")
    public static final String STEREOTYPE_NAME = "MemoryPartition_Instance";

    @objid ("a7430f55-2a93-4255-ad34-9bfb86afbeb4")
    public static final String MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Instance_concurrentResources";

    @objid ("fb92af4c-3338-477d-ac7c-91aba5881875")
    public static final String MEMORYPARTITION_INSTANCE_EXIT_TAGTYPE = "MemoryPartition_Instance_exit";

    @objid ("6eb61fc6-f3f1-486d-b201-41e4b252a3cd")
    public static final String MEMORYPARTITION_INSTANCE_FORK_TAGTYPE = "MemoryPartition_Instance_fork";

    @objid ("0766f789-ea91-418c-b881-c59c5daa1a7f")
    public static final String MEMORYPARTITION_INSTANCE_MEMORYSPACES_TAGTYPE = "MemoryPartition_Instance_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MemoryPartition_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("53395e88-0b0b-40da-b1e3-c7c95ccee380")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MemoryPartition_Instance >> then instantiate a {@link MemoryPartitionInstance} proxy.
     * 
     * @return a {@link MemoryPartitionInstance} proxy on the created {@link Instance}.
     */
    @objid ("99b32161-c83f-4f1e-a6c8-7f1ba7cd23b4")
    public static MemoryPartitionInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionInstance.STEREOTYPE_NAME);
        return MemoryPartitionInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionInstance} proxy from a {@link Instance} stereotyped << MemoryPartition_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MemoryPartitionInstance} proxy or <i>null</i>.
     */
    @objid ("d9f17bcb-d2bc-474c-8aaa-c0a9af1b02d6")
    public static MemoryPartitionInstance instantiate(final Instance obj) {
        return MemoryPartitionInstance.canInstantiate(obj) ? new MemoryPartitionInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionInstance} proxy from a {@link Instance} stereotyped << MemoryPartition_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MemoryPartitionInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("120929be-c9ea-467b-a30c-225077fc7205")
    public static MemoryPartitionInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MemoryPartitionInstance.canInstantiate(obj))
        	return new MemoryPartitionInstance(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("124689d5-11d4-41ff-b90f-4810c5c00229")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MemoryPartitionInstance other = (MemoryPartitionInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("eb2737f9-baa4-4417-a524-8245fa092a1f")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Instance_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4e8ea9d6-c30a-4381-93b1-e2579e7e8fa6")
    public List<String> getMemoryPartition_Instance_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionInstance.MdaTypes.MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Instance_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("beaa57ff-7ab5-47da-a75d-0d5993da3b9c")
    public List<String> getMemoryPartition_Instance_exit() {
        return this.elt.getTagValues(MemoryPartitionInstance.MdaTypes.MEMORYPARTITION_INSTANCE_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Instance_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("99888897-1143-41d4-b215-fcd4fa0a3277")
    public List<String> getMemoryPartition_Instance_fork() {
        return this.elt.getTagValues(MemoryPartitionInstance.MdaTypes.MEMORYPARTITION_INSTANCE_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Instance_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("857c5236-551d-4eec-a436-ecccb3134325")
    public List<String> getMemoryPartition_Instance_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionInstance.MdaTypes.MEMORYPARTITION_INSTANCE_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("27c18271-742f-448a-a160-0e4fd3fb93cb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Instance_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d651b79-a40a-4c1a-8398-5986cf8a2f09")
    public void setMemoryPartition_Instance_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionInstance.MdaTypes.MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Instance_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("10c7f2d0-6372-4f9a-9fc6-73408a8951a0")
    public void setMemoryPartition_Instance_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionInstance.MdaTypes.MEMORYPARTITION_INSTANCE_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Instance_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a16ea320-48d6-49dd-9e9b-249bafd8b2d4")
    public void setMemoryPartition_Instance_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionInstance.MdaTypes.MEMORYPARTITION_INSTANCE_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Instance_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea19d11d-edd9-4648-b218-814f9d403875")
    public void setMemoryPartition_Instance_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionInstance.MdaTypes.MEMORYPARTITION_INSTANCE_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("053f3f2c-cf75-42e2-bcad-f8cc341066e2")
    protected MemoryPartitionInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ed311ce3-01e3-484b-851e-650a3eeb265b")
    public static final class MdaTypes {
        @objid ("08f5667c-73f8-422c-827a-33ca69ac0c73")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("81c5e98b-2af2-4737-af18-1a7991637371")
        public static TagType MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("0f51e286-580b-442f-a3d1-953a62235509")
        public static TagType MEMORYPARTITION_INSTANCE_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("340bf630-d420-4fc0-b237-0957fccea62e")
        public static TagType MEMORYPARTITION_INSTANCE_FORK_TAGTYPE_ELT;

        @objid ("c3d014dd-c359-4eb7-9a90-627b22d16acc")
        public static TagType MEMORYPARTITION_INSTANCE_EXIT_TAGTYPE_ELT;

        @objid ("bebcf21f-1ead-4ea9-b9e8-6c0422eef9ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("5436c193-8f42-4431-93c5-30c307cc7da8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0fbec28b-460a-4cbf-94f5-664197c284eb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01e5e759-0ccf-11df-8525-001302895b2b");
            MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eb773f1-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_INSTANCE_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eb773f2-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_INSTANCE_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eb773f3-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_INSTANCE_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eb773f4-172b-11df-b92a-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
