/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association.SwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << MemoryPartition_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryPartitionAssociation extends SwResourceAssociation {
    public static final String STEREOTYPE_NAME = "MemoryPartition_Association";

    public static final String MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Association_concurrentResources";

    public static final String MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE = "MemoryPartition_Association_exit";

    public static final String MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE = "MemoryPartition_Association_fork";

    public static final String MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE = "MemoryPartition_Association_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << MemoryPartition_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << MemoryPartition_Association >> then instantiate a {@link MemoryPartitionAssociation} proxy.
     * 
     * @return a {@link MemoryPartitionAssociation} proxy on the created {@link Association}.
     */
    public static MemoryPartitionAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAssociation.STEREOTYPE_NAME);
        return MemoryPartitionAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAssociation} proxy from a {@link Association} stereotyped << MemoryPartition_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link MemoryPartitionAssociation} proxy or <i>null</i>.
     */
    public static MemoryPartitionAssociation instantiate(final Association obj) {
        return MemoryPartitionAssociation.canInstantiate(obj) ? new MemoryPartitionAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAssociation} proxy from a {@link Association} stereotyped << MemoryPartition_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link MemoryPartitionAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MemoryPartitionAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (MemoryPartitionAssociation.canInstantiate(obj))
        	return new MemoryPartitionAssociation(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        MemoryPartitionAssociation other = (MemoryPartitionAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Association_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Association_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Association_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Association_exit() {
        return this.elt.getTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Association_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Association_fork() {
        return this.elt.getTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Association_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Association_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Association_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Association_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Association_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Association_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Association_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Association_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Association_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Association_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    protected MemoryPartitionAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f5bdeb97-10cf-11df-81d9-0014222a9f79");
            MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1dcb6a5d-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1dcb6a5e-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1dcb6a5f-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1dcb6a60-172b-11df-b92a-0014222a9f79");
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
