/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << MemoryBroker_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("628848e9-2193-47c8-9549-0509e52cd8a3")
public class MemoryBrokerAttribute extends SwResourceAttribute {
    @objid ("edb8424f-aea1-4a23-9a73-f1ce70c2484a")
    public static final String STEREOTYPE_NAME = "MemoryBroker_Attribute";

    @objid ("a164ae08-b63d-4dbc-bc7a-3dec515096f9")
    public static final String MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Attribute_accessPolicy";

    @objid ("3d277976-e5ac-48c1-8ff9-c366c13351dd")
    public static final String MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE = "MemoryBroker_Attribute_lockServices";

    @objid ("caa251bb-2a3f-40c3-8585-cdb4b42c63df")
    public static final String MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE = "MemoryBroker_Attribute_mapServices";

    @objid ("43febd71-c388-43b8-9164-e361bd6b1545")
    public static final String MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE = "MemoryBroker_Attribute_memories";

    @objid ("0cbbb31f-eb1e-44e9-b891-ad112db2c69d")
    public static final String MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Attribute_memoryBlockAdressElements";

    @objid ("97d41f0a-8047-4681-8dff-4bceb2ba53be")
    public static final String MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Attribute_memoryBlockSizeElements";

    @objid ("b9673c67-9c88-4da7-9637-a9e0cd1e8251")
    public static final String MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Attribute_unMapServices";

    @objid ("38681cde-de57-4c11-8f95-2b0dece3fc65")
    public static final String MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Attribute_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MemoryBroker_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("977b3a55-16b4-4164-8ea4-175e635d0d77")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MemoryBroker_Attribute >> then instantiate a {@link MemoryBrokerAttribute} proxy.
     * 
     * @return a {@link MemoryBrokerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("a273bf27-e4ee-4d3a-9c39-854febd6c1b8")
    public static MemoryBrokerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAttribute.STEREOTYPE_NAME);
        return MemoryBrokerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAttribute} proxy from a {@link Attribute} stereotyped << MemoryBroker_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MemoryBrokerAttribute} proxy or <i>null</i>.
     */
    @objid ("5418a762-f2cd-4aa1-8914-52576c58a5d4")
    public static MemoryBrokerAttribute instantiate(final Attribute obj) {
        return MemoryBrokerAttribute.canInstantiate(obj) ? new MemoryBrokerAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAttribute} proxy from a {@link Attribute} stereotyped << MemoryBroker_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link MemoryBrokerAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f384143a-0cc2-4f6b-b99b-2399a7c5622f")
    public static MemoryBrokerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MemoryBrokerAttribute.canInstantiate(obj))
        	return new MemoryBrokerAttribute(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("26c3a7cd-bb12-46c5-bea4-63763509c242")
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
        MemoryBrokerAttribute other = (MemoryBrokerAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("4c7ed88b-b54e-44ed-8170-a7462f12acd3")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Attribute_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e624cbf-e069-4769-b6c0-a7ff751763b0")
    public String getMemoryBroker_Attribute_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5a389138-f328-4ba5-b7f1-5a5a633b31e3")
    public List<String> getMemoryBroker_Attribute_lockServices() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c8e9cc2d-ac9f-4199-9673-24bcad96e255")
    public List<String> getMemoryBroker_Attribute_mapServices() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("10de6d3c-b5fb-4d56-b497-293aeab588e8")
    public List<String> getMemoryBroker_Attribute_memories() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("37c12b89-7107-4c93-aa54-63385befa930")
    public List<String> getMemoryBroker_Attribute_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("02439acc-0e86-4288-8082-7df36641cbb4")
    public List<String> getMemoryBroker_Attribute_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e5bd6a9b-2e61-4904-b9c0-de578bc1c479")
    public List<String> getMemoryBroker_Attribute_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Attribute_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("12ddb48a-e2f4-469e-8418-72438dc1c04d")
    public List<String> getMemoryBroker_Attribute_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("6f2dfd5f-982c-43f7-b719-c410b1ecb1f0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Attribute_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41a72404-cf88-4769-8ffb-b239364a79f4")
    public void setMemoryBroker_Attribute_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09361fe6-19f1-4332-9a0b-cf09655aa8c9")
    public void setMemoryBroker_Attribute_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("995a76a3-7918-4deb-aa1e-35b5e88c581a")
    public void setMemoryBroker_Attribute_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("821d4293-0bf7-4922-8d61-9ad1d8f8eb0b")
    public void setMemoryBroker_Attribute_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("32f3ad78-63e7-424f-b0dd-f2d9272182e1")
    public void setMemoryBroker_Attribute_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e426f2d6-8f06-47e3-8fd8-1ff75506fc1e")
    public void setMemoryBroker_Attribute_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f689c8e6-984c-4a04-b57d-950a7fc07289")
    public void setMemoryBroker_Attribute_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Attribute_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58f9b435-3752-4571-bd35-32f86cf05b48")
    public void setMemoryBroker_Attribute_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAttribute.MdaTypes.MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("0ec5a583-9834-4dd8-b915-bab340f99d9a")
    protected MemoryBrokerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("841bfb2f-1809-4c1a-9d62-d65e8172ff8e")
    public static final class MdaTypes {
        @objid ("7a7fca29-b5a5-43a1-b4af-3e9effc87bf7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c15d9bde-aa75-4801-bb39-6676e002ff1f")
        public static TagType MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("ce54541c-d996-4cd2-ae41-bf5b2d059a22")
        public static TagType MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE_ELT;

        @objid ("1f144e9b-2c62-47b1-866e-cd295b7a7b0a")
        public static TagType MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("52a62874-e3c0-4364-be1f-50a835bc9799")
        public static TagType MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("279a0767-a238-41ef-b705-5c52bd2dbab3")
        public static TagType MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("751edcff-b0d6-46d8-b5ff-0ec569a006df")
        public static TagType MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("1efc8a0a-9786-4b2e-9359-04a7382207bb")
        public static TagType MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE_ELT;

        @objid ("3d97c666-886b-4738-a905-dfbe9f5d53da")
        public static TagType MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("d2f8fbf1-d07e-4b6a-849f-763d8b526c9d")
        private static Stereotype MDAASSOCDEP;

        @objid ("ffb7daa3-b286-4cb3-8256-3afd4af326c0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a95a3183-da34-4e06-8692-4bcc54a06793")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0204e580-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb1601c-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb1601b-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb1601a-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16019-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16018-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16017-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16016-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_ATTRIBUTE_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5fb16015-172e-11df-b92a-0014222a9f79");
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
