/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute.SwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << MemoryPartition_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryPartitionAttribute extends SwResourceAttribute {
    public static final String STEREOTYPE_NAME = "MemoryPartition_Attribute";

    public static final String MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Attribute_concurrentResources";

    public static final String MEMORYPARTITION_ATTRIBUTE_EXIT_TAGTYPE = "MemoryPartition_Attribute_exit";

    public static final String MEMORYPARTITION_ATTRIBUTE_FORK_TAGTYPE = "MemoryPartition_Attribute_fork";

    public static final String MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES_TAGTYPE = "MemoryPartition_Attribute_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MemoryPartition_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MemoryPartition_Attribute >> then instantiate a {@link MemoryPartitionAttribute} proxy.
     * 
     * @return a {@link MemoryPartitionAttribute} proxy on the created {@link Attribute}.
     */
    public static MemoryPartitionAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAttribute.STEREOTYPE_NAME);
        return MemoryPartitionAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAttribute} proxy from a {@link Attribute} stereotyped << MemoryPartition_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MemoryPartitionAttribute} proxy or <i>null</i>.
     */
    public static MemoryPartitionAttribute instantiate(final Attribute obj) {
        return MemoryPartitionAttribute.canInstantiate(obj) ? new MemoryPartitionAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAttribute} proxy from a {@link Attribute} stereotyped << MemoryPartition_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link MemoryPartitionAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MemoryPartitionAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MemoryPartitionAttribute.canInstantiate(obj))
        	return new MemoryPartitionAttribute(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryPartitionAttribute other = (MemoryPartitionAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Attribute_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Attribute_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Attribute_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Attribute_exit() {
        return this.elt.getTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Attribute_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Attribute_fork() {
        return this.elt.getTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Attribute_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Attribute_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Attribute_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Attribute_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Attribute_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Attribute_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Attribute_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Attribute_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Attribute_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Attribute_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    protected MemoryPartitionAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_ATTRIBUTE_FORK_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_ATTRIBUTE_EXIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01e5e756-0ccf-11df-8525-001302895b2b");
            MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20cfe6cd-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20cfe6ce-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ATTRIBUTE_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20cfe6cf-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ATTRIBUTE_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20cfe6d0-172b-11df-b92a-0014222a9f79");
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
