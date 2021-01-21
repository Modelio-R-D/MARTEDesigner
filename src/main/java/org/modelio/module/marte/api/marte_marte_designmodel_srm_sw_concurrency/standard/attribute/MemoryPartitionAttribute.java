/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

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
@objid ("9e921c61-944a-4214-a7d6-c73bb4c67b8e")
public class MemoryPartitionAttribute extends SwResourceAttribute {
    @objid ("d7c39627-ffc0-4a81-8831-fe90c34a9d45")
    public static final String STEREOTYPE_NAME = "MemoryPartition_Attribute";

    @objid ("b5e85c0d-e8d3-4990-a0fc-4c7858529010")
    public static final String MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Attribute_concurrentResources";

    @objid ("5ab7822a-0be8-4671-8bec-8a224b84f49d")
    public static final String MEMORYPARTITION_ATTRIBUTE_EXIT_TAGTYPE = "MemoryPartition_Attribute_exit";

    @objid ("4db6b283-75f4-47f4-9070-acc8e3f88669")
    public static final String MEMORYPARTITION_ATTRIBUTE_FORK_TAGTYPE = "MemoryPartition_Attribute_fork";

    @objid ("b171ae82-ab72-4289-b990-56caa7883249")
    public static final String MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES_TAGTYPE = "MemoryPartition_Attribute_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MemoryPartition_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c3a10be9-f052-4d2e-81b2-09f304ff5b46")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MemoryPartition_Attribute >> then instantiate a {@link MemoryPartitionAttribute} proxy.
     * 
     * @return a {@link MemoryPartitionAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("7569e8fd-bb21-48ec-aa16-679d25602886")
    public static MemoryPartitionAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAttribute.STEREOTYPE_NAME);
        return MemoryPartitionAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAttribute} proxy from a {@link Attribute} stereotyped << MemoryPartition_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MemoryPartitionAttribute} proxy or <i>null</i>.
     */
    @objid ("8b5498fa-1473-40f8-9097-849b292da51b")
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
    @objid ("1f0097c0-f614-44da-80f3-6c25689d6a64")
    public static MemoryPartitionAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MemoryPartitionAttribute.canInstantiate(obj))
        	return new MemoryPartitionAttribute(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aad957e2-0fc2-4e55-92bb-35a6a192b5fe")
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
    @objid ("66c97b9e-ee9b-4d53-aca6-d2f3301e4db3")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Attribute_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("af793086-48b5-4058-a729-71ece3765395")
    public List<String> getMemoryPartition_Attribute_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Attribute_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b0a75e19-d2c2-48f8-a85b-54e7bf26fb4d")
    public List<String> getMemoryPartition_Attribute_exit() {
        return this.elt.getTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Attribute_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8466915d-4244-4cfc-bfc6-baddf764d2c0")
    public List<String> getMemoryPartition_Attribute_fork() {
        return this.elt.getTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Attribute_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3e711371-3176-4d2a-96e6-101d07a83a30")
    public List<String> getMemoryPartition_Attribute_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("de0eced0-2ae1-45b4-8cd6-ddbc6846fb28")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Attribute_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("313e4665-9527-4f0a-8db8-3b93874cb414")
    public void setMemoryPartition_Attribute_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Attribute_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4fd467d-2744-4b4f-9a80-4a8595a5fb50")
    public void setMemoryPartition_Attribute_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Attribute_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("97af444e-7382-409c-a036-c862024cd2fe")
    public void setMemoryPartition_Attribute_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Attribute_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9085febd-7a85-4922-946a-eec76d2cf203")
    public void setMemoryPartition_Attribute_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAttribute.MdaTypes.MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("bf0bb264-575b-4326-850d-d51271a9dbd7")
    protected MemoryPartitionAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("691fbebf-fc91-4f74-9999-0fbf50fcf6b8")
    public static final class MdaTypes {
        @objid ("f7d47ed4-9135-4ea9-b940-a91a35f9528e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("403d505d-9f67-4da7-86d5-c34f2de09920")
        public static TagType MEMORYPARTITION_ATTRIBUTE_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("c504cfa8-872a-4148-9732-91a87b61d16e")
        public static TagType MEMORYPARTITION_ATTRIBUTE_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("04cfa145-a016-4803-905d-2de72025424c")
        public static TagType MEMORYPARTITION_ATTRIBUTE_FORK_TAGTYPE_ELT;

        @objid ("b573af3d-2803-40ac-a707-68ba55a6e603")
        public static TagType MEMORYPARTITION_ATTRIBUTE_EXIT_TAGTYPE_ELT;

        @objid ("57d0c68f-7383-4231-a9ec-a9a14f29c798")
        private static Stereotype MDAASSOCDEP;

        @objid ("333e3037-c1fe-4396-8994-7187ac3ab79f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4190689-0355-44b1-91b7-b2b1e97f6735")
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
