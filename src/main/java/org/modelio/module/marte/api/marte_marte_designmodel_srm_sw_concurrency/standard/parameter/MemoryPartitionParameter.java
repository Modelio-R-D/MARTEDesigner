/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.parameter.SwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << MemoryPartition_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryPartitionParameter extends SwResourceParameter {
    public static final String STEREOTYPE_NAME = "MemoryPartition_Parameter";

    public static final String MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Parameter_concurrentResources";

    public static final String MEMORYPARTITION_PARAMETER_EXIT_TAGTYPE = "MemoryPartition_Parameter_exit";

    public static final String MEMORYPARTITION_PARAMETER_FORK_TAGTYPE = "MemoryPartition_Parameter_fork";

    public static final String MEMORYPARTITION_PARAMETER_MEMORYSPACES_TAGTYPE = "MemoryPartition_Parameter_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << MemoryPartition_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << MemoryPartition_Parameter >> then instantiate a {@link MemoryPartitionParameter} proxy.
     * 
     * @return a {@link MemoryPartitionParameter} proxy on the created {@link Parameter}.
     */
    public static MemoryPartitionParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionParameter.STEREOTYPE_NAME);
        return MemoryPartitionParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionParameter} proxy from a {@link Parameter} stereotyped << MemoryPartition_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link MemoryPartitionParameter} proxy or <i>null</i>.
     */
    public static MemoryPartitionParameter instantiate(final Parameter obj) {
        return MemoryPartitionParameter.canInstantiate(obj) ? new MemoryPartitionParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionParameter} proxy from a {@link Parameter} stereotyped << MemoryPartition_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link MemoryPartitionParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MemoryPartitionParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (MemoryPartitionParameter.canInstantiate(obj))
        	return new MemoryPartitionParameter(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryPartitionParameter other = (MemoryPartitionParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Parameter_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Parameter_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Parameter_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Parameter_exit() {
        return this.elt.getTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Parameter_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Parameter_fork() {
        return this.elt.getTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Parameter_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_Parameter_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_MEMORYSPACES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Parameter_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Parameter_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Parameter_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Parameter_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Parameter_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Parameter_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Parameter_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_Parameter_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    protected MemoryPartitionParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_PARAMETER_MEMORYSPACES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_PARAMETER_FORK_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_PARAMETER_EXIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01e122b4-0ccf-11df-8525-001302895b2b");
            MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01e5e75a-0ccf-11df-8525-001302895b2b");
            MEMORYPARTITION_PARAMETER_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01e5e761-0ccf-11df-8525-001302895b2b");
            MEMORYPARTITION_PARAMETER_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01e5e768-0ccf-11df-8525-001302895b2b");
            MEMORYPARTITION_PARAMETER_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01e849aa-0ccf-11df-8525-001302895b2b");
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
