/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << MemoryBroker_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MemoryBrokerLifeline extends SwResourceLifeline {
    public static final String STEREOTYPE_NAME = "MemoryBroker_Lifeline";

    public static final String MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Lifeline_accessPolicy";

    public static final String MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE = "MemoryBroker_Lifeline_lockServices";

    public static final String MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE = "MemoryBroker_Lifeline_mapServices";

    public static final String MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE = "MemoryBroker_Lifeline_memories";

    public static final String MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Lifeline_memoryBlockAdressElements";

    public static final String MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Lifeline_memoryBlockSizeElements";

    public static final String MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Lifeline_unMapServices";

    public static final String MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Lifeline_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << MemoryBroker_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << MemoryBroker_Lifeline >> then instantiate a {@link MemoryBrokerLifeline} proxy.
     * 
     * @return a {@link MemoryBrokerLifeline} proxy on the created {@link Lifeline}.
     */
    public static MemoryBrokerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLifeline.STEREOTYPE_NAME);
        return MemoryBrokerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerLifeline} proxy from a {@link Lifeline} stereotyped << MemoryBroker_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link MemoryBrokerLifeline} proxy or <i>null</i>.
     */
    public static MemoryBrokerLifeline instantiate(final Lifeline obj) {
        return MemoryBrokerLifeline.canInstantiate(obj) ? new MemoryBrokerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerLifeline} proxy from a {@link Lifeline} stereotyped << MemoryBroker_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link MemoryBrokerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MemoryBrokerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (MemoryBrokerLifeline.canInstantiate(obj))
        	return new MemoryBrokerLifeline(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryBrokerLifeline other = (MemoryBrokerLifeline) obj;
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
     * Getter for string property 'MemoryBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMemoryBroker_Lifeline_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Lifeline_lockServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Lifeline_mapServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Lifeline_memories() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Lifeline_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Lifeline_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Lifeline_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Lifeline_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Lifeline_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Lifeline_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Lifeline_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Lifeline_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Lifeline_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Lifeline_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Lifeline_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Lifeline_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    protected MemoryBrokerLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4b40ae43-10d2-11df-81d9-0014222a9f79");
            MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce4-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce3-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce2-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce1-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655ce0-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655cdf-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655cde-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5c655cdd-172e-11df-b92a-0014222a9f79");
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
