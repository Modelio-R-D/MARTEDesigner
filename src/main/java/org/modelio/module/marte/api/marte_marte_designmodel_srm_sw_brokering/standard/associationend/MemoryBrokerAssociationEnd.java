/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << MemoryBroker_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("77729413-6792-467d-9383-015cbe8ff9e5")
public class MemoryBrokerAssociationEnd extends SwResourceAssociationEnd {
    @objid ("fbaeea63-c073-4fec-b74c-c7e662971681")
    public static final String STEREOTYPE_NAME = "MemoryBroker_AssociationEnd";

    @objid ("52e29749-2175-497b-ae78-7bb4cc449fcb")
    public static final String MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE = "MemoryBroker_AssociationEnd_accessPolicy";

    @objid ("cf979a3d-0dd2-4076-9a5b-b384ed59c84e")
    public static final String MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_lockServices";

    @objid ("94859812-ef97-4d71-a8ab-bb6798b166ba")
    public static final String MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_mapServices";

    @objid ("ae967701-0237-4ae2-8068-75ccbff47419")
    public static final String MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE = "MemoryBroker_AssociationEnd_memories";

    @objid ("fe4df719-a126-482d-94c2-45ace3aa9825")
    public static final String MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_AssociationEnd_memoryBlockAdressElements";

    @objid ("90ce857b-d09c-4e13-a536-890bb4584389")
    public static final String MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_AssociationEnd_memoryBlockSizeElements";

    @objid ("cf97ccfe-5d3a-4dc2-b8eb-d84a8b91cc73")
    public static final String MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_unMapServices";

    @objid ("49019ce0-2d9e-4df5-b1de-324b4b94bc01")
    public static final String MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_AssociationEnd_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b5e1a4bf-ffd7-4bd8-847d-2e7539e956af")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >> then instantiate a {@link MemoryBrokerAssociationEnd} proxy.
     * 
     * @return a {@link MemoryBrokerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("9e17da71-9009-4f92-8319-17b2dec25977")
    public static MemoryBrokerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerAssociationEnd.STEREOTYPE_NAME);
        return MemoryBrokerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link MemoryBrokerAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("67548b3c-febb-4aa2-a0c0-d303b3f3370f")
    public static MemoryBrokerAssociationEnd instantiate(final AssociationEnd obj) {
        return MemoryBrokerAssociationEnd.canInstantiate(obj) ? new MemoryBrokerAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MemoryBroker_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link MemoryBrokerAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("be09edd4-143c-47e6-bd4d-3caee0726bbb")
    public static MemoryBrokerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (MemoryBrokerAssociationEnd.canInstantiate(obj))
        	return new MemoryBrokerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0d1d98cb-865c-4f88-abd9-71f4fdfffd32")
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
        MemoryBrokerAssociationEnd other = (MemoryBrokerAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("5707dd73-46f9-4bfb-91cc-7f135f9a8015")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e214b16-ffdb-47f7-9202-447ea9f7e205")
    public String getMemoryBroker_AssociationEnd_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("da8eb745-322e-468a-83fc-084148c70871")
    public List<String> getMemoryBroker_AssociationEnd_lockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0cc4874a-4e38-453e-96c9-3347e7145115")
    public List<String> getMemoryBroker_AssociationEnd_mapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d575ed77-2ec0-415e-871d-8f0617ac1fe3")
    public List<String> getMemoryBroker_AssociationEnd_memories() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a01853b5-311a-468a-bdd0-1515afc4fda6")
    public List<String> getMemoryBroker_AssociationEnd_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6031e64b-a73d-4012-8172-e5696ccf2588")
    public List<String> getMemoryBroker_AssociationEnd_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f382c74f-428e-4187-8688-c9b33fea0737")
    public List<String> getMemoryBroker_AssociationEnd_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_AssociationEnd_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2ed26924-ad9b-462a-8869-e269991fd424")
    public List<String> getMemoryBroker_AssociationEnd_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("47251be9-41b2-4dcc-b7f1-60bf9d1f3e59")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d388f3e-0ab1-42a9-bfe4-736c75536f95")
    public void setMemoryBroker_AssociationEnd_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b0f70ba-7491-4dad-b7bb-79f857a29fde")
    public void setMemoryBroker_AssociationEnd_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c3dabc6-ac03-4015-a405-549f17413073")
    public void setMemoryBroker_AssociationEnd_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f386468f-92ea-4cdf-a31a-5e5c15c35481")
    public void setMemoryBroker_AssociationEnd_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("039b812c-7d65-429e-9e19-3213108ce1da")
    public void setMemoryBroker_AssociationEnd_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bad837cf-9bc6-4fb8-8735-9c25bd714cd0")
    public void setMemoryBroker_AssociationEnd_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e83b2f5-f4b4-4b38-a2a9-61ac569cc556")
    public void setMemoryBroker_AssociationEnd_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_AssociationEnd_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("926f3289-99d3-4c47-bf94-f0d3491adf3b")
    public void setMemoryBroker_AssociationEnd_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerAssociationEnd.MdaTypes.MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("43ee0ea9-f2d1-4a8b-94c2-bf6b0b05e5b3")
    protected MemoryBrokerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("659cdcb8-309c-4b25-a80f-32f9f04d729e")
    public static final class MdaTypes {
        @objid ("2657f62f-c3a7-4af0-9d78-88cc806e75fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1129c59f-42b5-4129-b25a-90e21b5c0915")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("bc7dbe78-5f61-4b25-96fe-c177d4462c52")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT;

        @objid ("b33fc044-9624-40a8-99b2-657ed6e3ff2a")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("14fbb8fb-666b-4411-abc3-93709364c043")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("c6ade5aa-b240-4f29-80e2-fbc6eaafd60f")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("85bf3e3f-bbd2-4c68-9ef1-5964295c2ea0")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("4d2442d5-0c94-4ab3-b56a-37564d644394")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT;

        @objid ("87f3860e-30dd-4f18-9a62-5acff0bd72fe")
        public static TagType MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("1c0d5675-a53d-430d-b736-f947909fbf6b")
        private static Stereotype MDAASSOCDEP;

        @objid ("518d7d6e-1d9e-41d5-9ca3-764ce4d69842")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d895d22f-ba26-4584-bd99-81d8b06f1933")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0204e57e-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0204e585-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0204e58c-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0204e593-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0204e59a-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020747d0-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020747d7-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020747de-0ccf-11df-8525-001302895b2b");
            MEMORYBROKER_ASSOCIATIONEND_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020747e5-0ccf-11df-8525-001302895b2b");
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
