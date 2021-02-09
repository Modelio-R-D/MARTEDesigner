/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << MemoryBroker_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryBrokerParameter extends SwResourceParameter {
    public static final String STEREOTYPE_NAME = "MemoryBroker_Parameter";

    public static final String MEMORYBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Parameter_accessPolicy";

    public static final String MEMORYBROKER_PARAMETER_LOCKSERVICES_TAGTYPE = "MemoryBroker_Parameter_lockServices";

    public static final String MEMORYBROKER_PARAMETER_MAPSERVICES_TAGTYPE = "MemoryBroker_Parameter_mapServices";

    public static final String MEMORYBROKER_PARAMETER_MEMORIES_TAGTYPE = "MemoryBroker_Parameter_memories";

    public static final String MEMORYBROKER_PARAMETER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Parameter_memoryBlockAdressElements";

    public static final String MEMORYBROKER_PARAMETER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Parameter_memoryBlockSizeElements";

    public static final String MEMORYBROKER_PARAMETER_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Parameter_unMapServices";

    public static final String MEMORYBROKER_PARAMETER_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Parameter_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << MemoryBroker_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << MemoryBroker_Parameter >> then instantiate a {@link MemoryBrokerParameter} proxy.
     * 
     * @return a {@link MemoryBrokerParameter} proxy on the created {@link Parameter}.
     */
    public static MemoryBrokerParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerParameter.STEREOTYPE_NAME);
        return MemoryBrokerParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerParameter} proxy from a {@link Parameter} stereotyped << MemoryBroker_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link MemoryBrokerParameter} proxy or <i>null</i>.
     */
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
    public static MemoryBrokerParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (MemoryBrokerParameter.canInstantiate(obj))
        	return new MemoryBrokerParameter(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryBrokerParameter other = (MemoryBrokerParameter) obj;
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
     * Getter for string property 'MemoryBroker_Parameter_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMemoryBroker_Parameter_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Parameter_lockServices() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Parameter_mapServices() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Parameter_memories() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Parameter_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Parameter_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Parameter_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Parameter_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Parameter_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Parameter_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Parameter_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Parameter_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Parameter_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Parameter_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Parameter_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Parameter_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Parameter_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Parameter_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Parameter_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerParameter.MdaTypes.MEMORYBROKER_PARAMETER_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    protected MemoryBrokerParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_PARAMETER_MEMORIES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_PARAMETER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_PARAMETER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_PARAMETER_LOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_PARAMETER_UNLOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_PARAMETER_MAPSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_PARAMETER_UNMAPSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
