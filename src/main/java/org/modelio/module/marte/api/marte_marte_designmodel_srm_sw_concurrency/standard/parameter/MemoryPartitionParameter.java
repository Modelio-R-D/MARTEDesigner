/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
@objid ("07ddc149-85a6-46d3-9ecd-3d32e4028929")
public class MemoryPartitionParameter extends SwResourceParameter {
    @objid ("c8e93c32-0f44-4162-93db-0cb353a4ea7f")
    public static final String STEREOTYPE_NAME = "MemoryPartition_Parameter";

    @objid ("0a0044e0-c5e0-4281-8e77-f686c69a5ef6")
    public static final String MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Parameter_concurrentResources";

    @objid ("b103d665-039b-4f36-8ab5-a85a49d2026e")
    public static final String MEMORYPARTITION_PARAMETER_EXIT_TAGTYPE = "MemoryPartition_Parameter_exit";

    @objid ("ced5d474-6a5a-4366-bcbb-bb1a5290bd50")
    public static final String MEMORYPARTITION_PARAMETER_FORK_TAGTYPE = "MemoryPartition_Parameter_fork";

    @objid ("6bbce12b-5eec-4098-a0a5-4f63e069c780")
    public static final String MEMORYPARTITION_PARAMETER_MEMORYSPACES_TAGTYPE = "MemoryPartition_Parameter_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << MemoryPartition_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("abae71db-c3ee-48d0-82f2-1f01eeec1377")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << MemoryPartition_Parameter >> then instantiate a {@link MemoryPartitionParameter} proxy.
     * 
     * @return a {@link MemoryPartitionParameter} proxy on the created {@link Parameter}.
     */
    @objid ("880ed2b0-6d6d-432f-976f-02100e369f22")
    public static MemoryPartitionParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionParameter.STEREOTYPE_NAME);
        return MemoryPartitionParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionParameter} proxy from a {@link Parameter} stereotyped << MemoryPartition_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link MemoryPartitionParameter} proxy or <i>null</i>.
     */
    @objid ("9560a608-ed97-403f-94d8-a7e3d8d2058b")
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
    @objid ("94e7747a-5464-445c-8d84-31c588bc74aa")
    public static MemoryPartitionParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (MemoryPartitionParameter.canInstantiate(obj))
        	return new MemoryPartitionParameter(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d3e98c53-c48c-45f4-8899-30c1f443f9fb")
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
    @objid ("db66cdca-c118-472e-9e9e-27891c372eb4")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Parameter_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e3f991b0-ef2e-42e0-82f5-647a5fb09658")
    public List<String> getMemoryPartition_Parameter_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Parameter_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c3326556-d403-4de3-99a3-d6308c797b5a")
    public List<String> getMemoryPartition_Parameter_exit() {
        return this.elt.getTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Parameter_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("455545a9-b920-4738-9070-62a44efdeabd")
    public List<String> getMemoryPartition_Parameter_fork() {
        return this.elt.getTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Parameter_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("86595e7f-95b9-42aa-aba7-c0607c8cbbb9")
    public List<String> getMemoryPartition_Parameter_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("50e700cd-28da-400f-b3d1-3af3f03d96db")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Parameter_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("129b73a5-15c3-44f7-afbb-000ce3d8c2c9")
    public void setMemoryPartition_Parameter_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Parameter_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("422a30d0-b349-40b7-9916-9d94f2dae3ad")
    public void setMemoryPartition_Parameter_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Parameter_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("74337f32-f09e-4d3d-b6a2-726b93a2bd8e")
    public void setMemoryPartition_Parameter_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Parameter_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("225fe795-7a08-4009-93d4-4f2c268282fd")
    public void setMemoryPartition_Parameter_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionParameter.MdaTypes.MEMORYPARTITION_PARAMETER_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("a1b847f9-7351-44ef-9e22-60bdbb3e9324")
    protected MemoryPartitionParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("8096d4d0-4778-47a0-bd0a-3c0af69f7f5a")
    public static final class MdaTypes {
        @objid ("0894cbf1-f274-4111-8043-c0f6ff97f68a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("253ef894-5fe1-4c3c-9b17-676b37a0d8e3")
        public static TagType MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("ef14e362-5491-4ffc-a0ae-e1bfa561af1e")
        public static TagType MEMORYPARTITION_PARAMETER_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("e5e18d2e-932a-4138-a3a5-9085660bbcd1")
        public static TagType MEMORYPARTITION_PARAMETER_FORK_TAGTYPE_ELT;

        @objid ("cfbb2434-bcb7-44e4-b84e-fb5abd99f35e")
        public static TagType MEMORYPARTITION_PARAMETER_EXIT_TAGTYPE_ELT;

        @objid ("48592b1e-95ef-4a78-83c5-750efa659728")
        private static Stereotype MDAASSOCDEP;

        @objid ("c79b2a44-81ff-44cd-bb95-356bdb349067")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("47afb76a-6070-4ba3-986d-deafc323c1e5")
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
