/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << MemoryBroker_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("345105c8-d336-4ae4-bd5e-ebf91d4be050")
public class MemoryBrokerParameter extends SwResourceParameter {
    @objid ("c5cb2d75-ed12-417d-95a8-94160c647f1e")
    public static final String STEREOTYPE_NAME = "MemoryBroker_Parameter";

    @objid ("2aaf5e26-79f4-4159-b73e-639a9020b0c6")
    public static final String MEMORYBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Parameter_accessPolicy";

    @objid ("19829734-e6c9-45c6-83ab-1b40685ca3e5")
    public static final String MEMORYBROKER_PARAMETER_LOCKSERVICES_TAGTYPE = "MemoryBroker_Parameter_lockServices";

    @objid ("85894210-faba-4010-a4c1-9d409107e0cb")
    public static final String MEMORYBROKER_PARAMETER_MAPSERVICES_TAGTYPE = "MemoryBroker_Parameter_mapServices";

    @objid ("9e3b30c9-a60d-4a85-82c4-96c924b0c743")
    public static final String MEMORYBROKER_PARAMETER_MEMORIES_TAGTYPE = "MemoryBroker_Parameter_memories";

    @objid ("cef7f161-d5fc-4fd5-bf52-5adc7a180f15")
    public static final String MEMORYBROKER_PARAMETER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Parameter_memoryBlockAdressElements";

    @objid ("4f7da6b4-c32c-4b1c-b797-e961d56d4ae0")
    public static final String MEMORYBROKER_PARAMETER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Parameter_memoryBlockSizeElements";

    @objid ("9c8ee2b2-2387-4b4e-b5d8-3e556ba70950")
    public static final String MEMORYBROKER_PARAMETER_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Parameter_unMapServices";

    @objid ("11caf81b-10df-471c-8b19-94e8476b40be")
    public static final String MEMORYBROKER_PARAMETER_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Parameter_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << MemoryBroker_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("18c0ca72-1bbd-4afd-ace7-3c2451ff4373")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << MemoryBroker_Parameter >> then instantiate a {@link MemoryBrokerParameter} proxy.
     * 
     * @return a {@link MemoryBrokerParameter} proxy on the created {@link Parameter}.
     */
    @objid ("13c88505-444f-40e5-a1af-cc0f620172c9")
    public static MemoryBrokerParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerParameter.STEREOTYPE_NAME);
        return MemoryBrokerParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerParameter} proxy from a {@link Parameter} stereotyped << MemoryBroker_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link MemoryBrokerParameter} proxy or <i>null</i>.
     */
    @objid ("2dab8d5d-4ff2-4744-9254-c42bcfc981ae")
    public static MemoryBrokerParameter instantiate(final Parameter obj) {
        return MemoryBrokerParameter.canInstantiate(obj) ? new MemoryBrokerParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerParameter} proxy from a {@link Parameter} stereotyped << MemoryBroker_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link MemoryBrokerParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a6e37e3a-474e-4869-ae95-efea4eb91323")
    public static MemoryBrokerParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (MemoryBrokerParameter.canInstantiate(obj))
        	return new MemoryBrokerParameter(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f25c46ae-7e89-429c-a3d3-cdb92f723cb0")
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
        MemoryBrokerParameter other = (MemoryBrokerParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("1210d23d-9158-41dc-8799-97e10cf5c103")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Parameter_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8dafacbc-d2d9-4ed5-adee-ae8b3c97eab9")
    public String getMemoryBroker_Parameter_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ef4df92a-7bd0-4d73-a910-1122258bfeac")
    public List<String> getMemoryBroker_Parameter_lockServices() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ee184b1d-863b-4d5a-9ca6-7edd60ad4f01")
    public List<String> getMemoryBroker_Parameter_mapServices() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9413f9f4-5d24-4ec3-8574-a69cdd30dd02")
    public List<String> getMemoryBroker_Parameter_memories() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4cddad3f-bb4c-4a06-b006-82d870c26e5c")
    public List<String> getMemoryBroker_Parameter_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0ff5161f-08b8-495d-b518-dfa5fa97cacc")
    public List<String> getMemoryBroker_Parameter_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a1323ae2-ee24-4d0b-9d95-42893f504d64")
    public List<String> getMemoryBroker_Parameter_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f63e92a0-9c72-4e70-9b94-1bf062111a62")
    public List<String> getMemoryBroker_Parameter_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("8d43d021-7179-4856-9262-c9a2a20346a2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Parameter_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("130e2230-9e16-4c38-adfe-724733c80759")
    public void setMemoryBroker_Parameter_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c3506ac-a82b-4eea-8569-e4916bf506dc")
    public void setMemoryBroker_Parameter_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ce6e4e5-125d-45c5-ad15-9d9736a62ac1")
    public void setMemoryBroker_Parameter_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("330eeee1-2e1b-4501-a7c6-5d9a8e6e70d7")
    public void setMemoryBroker_Parameter_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6146fc99-e13c-4f8f-81e1-7069beeff1f4")
    public void setMemoryBroker_Parameter_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c4a426b-17a2-4d3b-b0eb-ff37ccac1928")
    public void setMemoryBroker_Parameter_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72bf2ba6-bbf1-46fb-b93a-f0aab00ef139")
    public void setMemoryBroker_Parameter_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8169e462-9902-481f-8e7b-0388d2fcddd4")
    public void setMemoryBroker_Parameter_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("79a1d937-bad0-4c9b-bac2-ae3e336b1594")
    protected MemoryBrokerParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("2a5d612e-5ae7-413e-8f20-1a9698605bca")
    public static final class MdaTypes {
        @objid ("eefa9542-eacb-42ca-97ef-13dca6d167e2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c6f245a-6063-4f1a-9212-cb53e1106f7d")
        public static TagType MEMORYBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("27e2e63c-791e-4ca1-a9c5-c3b38c1686fb")
        public static TagType MEMORYBROKER_PARAMETER_MEMORIES_TAGTYPE_ELT;

        @objid ("a8b785eb-89ab-430d-8dd3-e36775555c77")
        public static TagType MEMORYBROKER_PARAMETER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("dfd57786-f8a6-4a40-b208-06b75e18a8ec")
        public static TagType MEMORYBROKER_PARAMETER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("0bd46418-2b3a-4963-90ec-54964cc499e1")
        public static TagType MEMORYBROKER_PARAMETER_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("67e02a81-e11a-4abf-8464-c102097125f0")
        public static TagType MEMORYBROKER_PARAMETER_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("fd5942ee-957b-4f79-b321-a54e928acbf6")
        public static TagType MEMORYBROKER_PARAMETER_MAPSERVICES_TAGTYPE_ELT;

        @objid ("0e11d895-8c27-4da9-aa04-48ba0ceb7e00")
        public static TagType MEMORYBROKER_PARAMETER_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("5bd388f7-25de-497e-8001-d86040f2971a")
        private static Stereotype MDAASSOCDEP;

        @objid ("6a34b994-d8c6-4426-9279-b26c9d99a6b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0711c3e7-34be-4dba-ba7b-d0dd1c4bf33d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01fdbea7-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5908a928-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_PARAMETER_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5908a927-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_PARAMETER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5908a926-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_PARAMETER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5908a925-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_PARAMETER_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5908a924-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_PARAMETER_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5908a923-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_PARAMETER_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5908a922-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_PARAMETER_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5908a921-172e-11df-b92a-0014222a9f79");
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
