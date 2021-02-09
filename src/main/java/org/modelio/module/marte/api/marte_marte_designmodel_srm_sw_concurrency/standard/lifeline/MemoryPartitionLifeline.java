/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << MemoryPartition_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryPartitionLifeline extends SwResourceLifeline {
    public static final String STEREOTYPE_NAME = "MemoryPartition_Lifeline";

    public static final String MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Lifeline_concurrentResources";

    public static final String MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE = "MemoryPartition_Lifeline_exit";

    public static final String MEMORYPARTITION_LIFELINE_FORK_TAGTYPE = "MemoryPartition_Lifeline_fork";

    public static final String MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE = "MemoryPartition_Lifeline_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << MemoryPartition_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << MemoryPartition_Lifeline >> then instantiate a {@link MemoryPartitionLifeline} proxy.
     * 
     * @return a {@link MemoryPartitionLifeline} proxy on the created {@link Lifeline}.
     */
    public static MemoryPartitionLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionLifeline.STEREOTYPE_NAME);
        return MemoryPartitionLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionLifeline} proxy from a {@link Lifeline} stereotyped << MemoryPartition_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link MemoryPartitionLifeline} proxy or <i>null</i>.
     */
    public static MemoryPartitionLifeline instantiate(final Lifeline obj) {
        return MemoryPartitionLifeline.canInstantiate(obj) ? new MemoryPartitionLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionLifeline} proxy from a {@link Lifeline} stereotyped << MemoryPartition_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link MemoryPartitionLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MemoryPartitionLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (MemoryPartitionLifeline.canInstantiate(obj))
        	return new MemoryPartitionLifeline(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryPartitionLifeline other = (MemoryPartitionLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Lifeline_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Lifeline_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Lifeline_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Lifeline_exit() {
        return this.elt.getTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Lifeline_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Lifeline_fork() {
        return this.elt.getTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Lifeline_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Lifeline_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Lifeline_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Lifeline_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Lifeline_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Lifeline_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Lifeline_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Lifeline_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Lifeline_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Lifeline_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    protected MemoryPartitionLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_LIFELINE_FORK_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f5dcea50-10cf-11df-81d9-0014222a9f79");
            MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1cf273a9-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1cf273aa-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_LIFELINE_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1cf273ab-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1cf273ac-172b-11df-b92a-0014222a9f79");
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
