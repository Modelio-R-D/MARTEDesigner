/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("7cccbe4d-a100-4963-8605-8022d7f47156")
public class MemoryBrokerLifeline extends SwResourceLifeline {
    @objid ("b088dd0b-5734-417f-b6ef-e8a86382f321")
    public static final String STEREOTYPE_NAME = "MemoryBroker_Lifeline";

    @objid ("fb94e6dd-44f1-4aed-9044-8ff2863f4875")
    public static final String MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Lifeline_accessPolicy";

    @objid ("273faee0-959a-489f-a740-af1f2c8f35be")
    public static final String MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE = "MemoryBroker_Lifeline_lockServices";

    @objid ("cae24fe6-ce39-44d3-9555-8e58bd0f234d")
    public static final String MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE = "MemoryBroker_Lifeline_mapServices";

    @objid ("d4bd173f-6759-491f-a001-1a89b8344b2c")
    public static final String MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE = "MemoryBroker_Lifeline_memories";

    @objid ("8505af04-8f94-470d-b99e-db03cc744c55")
    public static final String MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Lifeline_memoryBlockAdressElements";

    @objid ("935046ab-fa3f-4479-853f-dff2e3c78413")
    public static final String MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Lifeline_memoryBlockSizeElements";

    @objid ("70d086e0-33e7-42a8-a880-520eb01966d4")
    public static final String MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Lifeline_unMapServices";

    @objid ("46a65bb5-2b8c-41ab-a8ef-a4ec8cef6331")
    public static final String MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Lifeline_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << MemoryBroker_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d849a717-31aa-4798-b8d8-995ea1ae543f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << MemoryBroker_Lifeline >> then instantiate a {@link MemoryBrokerLifeline} proxy.
     * 
     * @return a {@link MemoryBrokerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("c6d780cf-833d-40ee-88cf-19e967d43b0b")
    public static MemoryBrokerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerLifeline.STEREOTYPE_NAME);
        return MemoryBrokerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerLifeline} proxy from a {@link Lifeline} stereotyped << MemoryBroker_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link MemoryBrokerLifeline} proxy or <i>null</i>.
     */
    @objid ("36051de2-0cb7-4643-b677-94340328298d")
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
    @objid ("8d7c0258-efc3-4bc6-8ff3-356ecc6bf9fe")
    public static MemoryBrokerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (MemoryBrokerLifeline.canInstantiate(obj))
        	return new MemoryBrokerLifeline(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4fa3b5e1-c607-4082-958e-454d95617518")
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
    @objid ("8aca42db-9271-4cbf-b7f7-7427a1dde413")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("000d81f3-d6ec-4db9-abfa-af88cef8305b")
    public String getMemoryBroker_Lifeline_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f6839dc4-6f0e-4bb2-a6e0-8e0a805c5b10")
    public List<String> getMemoryBroker_Lifeline_lockServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1ccb546c-1a63-44d9-af43-08b7c03c7d70")
    public List<String> getMemoryBroker_Lifeline_mapServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cc487bdd-450c-4de8-8a29-72482eb11472")
    public List<String> getMemoryBroker_Lifeline_memories() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5ee322d5-0d59-449a-941c-a59ca2ffbc38")
    public List<String> getMemoryBroker_Lifeline_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("de1b27f3-f392-4e22-b839-6ebe1765cfcd")
    public List<String> getMemoryBroker_Lifeline_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("77626b92-67fa-4cc6-89fc-c87b50c7215d")
    public List<String> getMemoryBroker_Lifeline_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Lifeline_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8852668c-ca84-457c-8f0f-ba5450d85c18")
    public List<String> getMemoryBroker_Lifeline_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("f1157c4d-fb19-47d8-8ffe-b29849b53448")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("43ed73ea-de20-4a35-8beb-35450e9050e7")
    public void setMemoryBroker_Lifeline_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a78e25fd-af72-44c3-bd42-fce68bb2371c")
    public void setMemoryBroker_Lifeline_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e9f5e5f-fbe8-434b-bf31-08a03d7d6074")
    public void setMemoryBroker_Lifeline_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba18a332-fc2b-4db4-9072-e7c903e7f5f0")
    public void setMemoryBroker_Lifeline_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("033b8ad6-fc66-4613-a894-9d2012782f4e")
    public void setMemoryBroker_Lifeline_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70aad0d6-fb10-4e1e-b1ff-fa8f3a13d0ed")
    public void setMemoryBroker_Lifeline_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1627b20-e354-4eaa-a0a3-14cbd1cb2137")
    public void setMemoryBroker_Lifeline_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Lifeline_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("329f7e5e-e9c2-4bba-b816-6df3ca1d8da7")
    public void setMemoryBroker_Lifeline_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerLifeline.MdaTypes.MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("3d333051-eed0-4fa0-907f-f97397f1ec22")
    protected MemoryBrokerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("7ef5fbd7-b439-491f-b544-74c14f7a0ac6")
    public static final class MdaTypes {
        @objid ("71595f42-c076-4fab-9efa-8995485efb96")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67614052-95c3-4506-93c5-023d4a25a32c")
        public static TagType MEMORYBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("cc36369e-71c6-4e75-a3df-e7c61861f6d6")
        public static TagType MEMORYBROKER_LIFELINE_MEMORIES_TAGTYPE_ELT;

        @objid ("ccc1dcf8-9f67-490d-aee9-9c999f9b9e51")
        public static TagType MEMORYBROKER_LIFELINE_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("21d46812-6cff-48f3-a952-c16f4fa5f93f")
        public static TagType MEMORYBROKER_LIFELINE_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("44563b08-c462-4a8f-8a8c-4b7c4e42469a")
        public static TagType MEMORYBROKER_LIFELINE_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("5c0fd191-31d7-4068-a401-7ec5de33b7c8")
        public static TagType MEMORYBROKER_LIFELINE_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("206bf13f-5014-479f-b8eb-936cedfe0ab0")
        public static TagType MEMORYBROKER_LIFELINE_MAPSERVICES_TAGTYPE_ELT;

        @objid ("7aa5a01a-6238-4643-bcd8-6aebbab07ca1")
        public static TagType MEMORYBROKER_LIFELINE_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("0cba0640-814a-4f2d-b8a5-590f5ee21023")
        private static Stereotype MDAASSOCDEP;

        @objid ("e0d2406f-370f-4d9a-988e-a9a3ee783049")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4a009df3-e6bc-4d47-93f3-a014166a16b5")
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
