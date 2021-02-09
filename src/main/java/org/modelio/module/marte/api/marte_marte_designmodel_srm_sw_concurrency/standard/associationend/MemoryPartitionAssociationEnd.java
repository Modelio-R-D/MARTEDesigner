/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << MemoryPartition_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryPartitionAssociationEnd extends SwResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "MemoryPartition_AssociationEnd";

    public static final String MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_AssociationEnd_concurrentResources";

    public static final String MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE = "MemoryPartition_AssociationEnd_exit";

    public static final String MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE = "MemoryPartition_AssociationEnd_fork";

    public static final String MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE = "MemoryPartition_AssociationEnd_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << MemoryPartition_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << MemoryPartition_AssociationEnd >> then instantiate a {@link MemoryPartitionAssociationEnd} proxy.
     * 
     * @return a {@link MemoryPartitionAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static MemoryPartitionAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAssociationEnd.STEREOTYPE_NAME);
        return MemoryPartitionAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MemoryPartition_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link MemoryPartitionAssociationEnd} proxy or <i>null</i>.
     */
    public static MemoryPartitionAssociationEnd instantiate(final AssociationEnd obj) {
        return MemoryPartitionAssociationEnd.canInstantiate(obj) ? new MemoryPartitionAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MemoryPartition_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link MemoryPartitionAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MemoryPartitionAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (MemoryPartitionAssociationEnd.canInstantiate(obj))
        	return new MemoryPartitionAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryPartitionAssociationEnd other = (MemoryPartitionAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_AssociationEnd_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_AssociationEnd_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_AssociationEnd_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_AssociationEnd_exit() {
        return this.elt.getTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_AssociationEnd_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_AssociationEnd_fork() {
        return this.elt.getTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_AssociationEnd_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_AssociationEnd_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_AssociationEnd_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_AssociationEnd_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_AssociationEnd_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_AssociationEnd_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_AssociationEnd_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_AssociationEnd_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_AssociationEnd_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_AssociationEnd_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociationEnd.MdaTypes.MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    protected MemoryPartitionAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01e5e754-0ccf-11df-8525-001302895b2b");
            MEMORYPARTITION_ASSOCIATIONEND_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "229c0e29-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATIONEND_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "229c0e2a-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATIONEND_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "229c0e2b-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATIONEND_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "229c0e2c-172b-11df-b92a-0014222a9f79");
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
