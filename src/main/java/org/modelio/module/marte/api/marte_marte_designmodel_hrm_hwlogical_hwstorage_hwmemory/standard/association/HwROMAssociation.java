/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwROM_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("df506239-09c1-47c3-b76a-36edf5b77869")
public class HwROMAssociation extends HwMemoryAssociation {
    @objid ("2cb8a2ae-b80b-46c9-be69-0a68781f859c")
    public static final String STEREOTYPE_NAME = "HwROM_Association";

    @objid ("442beadc-914c-4461-b704-7c3c4746f063")
    public static final String HWROM_ASSOCIATION_ORGANIZATION_TAGTYPE = "HwROM_Association_organization";

    @objid ("4c670ddd-d84c-4546-b57d-ab06a91e88ed")
    public static final String HWROM_ASSOCIATION_TYPE_TAGTYPE = "HwROM_Association_type";

    /**
     * Tells whether a {@link HwROMAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwROM_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4aac16c4-6caf-4428-956c-26f8cff2b4b1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwROM_Association >> then instantiate a {@link HwROMAssociation} proxy.
     * 
     * @return a {@link HwROMAssociation} proxy on the created {@link Association}.
     */
    @objid ("3d585d99-c9a0-4877-a22a-a441770f67d5")
    public static HwROMAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMAssociation.STEREOTYPE_NAME);
        return HwROMAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwROMAssociation} proxy from a {@link Association} stereotyped << HwROM_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwROMAssociation} proxy or <i>null</i>.
     */
    @objid ("abd44cb9-5402-4788-9aca-9ffba2f0f7f4")
    public static HwROMAssociation instantiate(final Association obj) {
        return HwROMAssociation.canInstantiate(obj) ? new HwROMAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwROMAssociation} proxy from a {@link Association} stereotyped << HwROM_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwROMAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2563961c-7814-4cd4-9ebe-b45aa135ead3")
    public static HwROMAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwROMAssociation.canInstantiate(obj))
        	return new HwROMAssociation(obj);
        else
        	throw new IllegalArgumentException("HwROMAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4f4bac5f-5ab1-4101-8672-694147df4ae9")
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
        HwROMAssociation other = (HwROMAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("7c4dd0be-9fca-4b02-9dca-1751f56c1661")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd10ef66-104a-4cfe-b397-333ddb58c21b")
    public String getHwROM_Association_organization() {
        return this.elt.getTagValue(HwROMAssociation.MdaTypes.HWROM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da73514c-c113-403a-ba30-a44f4928b697")
    public String getHwROM_Association_type() {
        return this.elt.getTagValue(HwROMAssociation.MdaTypes.HWROM_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    @objid ("5b149426-c6ed-46eb-b652-8a9ef52e4ca4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Association_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a8364d2-4a11-4ec7-a198-df4decde5c6c")
    public void setHwROM_Association_organization(final String value) {
        this.elt.putTagValue(HwROMAssociation.MdaTypes.HWROM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3100b25a-aeb0-4cdb-9ec3-c04a4bd7f263")
    public void setHwROM_Association_type(final String value) {
        this.elt.putTagValue(HwROMAssociation.MdaTypes.HWROM_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("63279d0e-5e7a-4d18-b93f-99dedfb05986")
    protected HwROMAssociation(final Association elt) {
        super(elt);
    }

    @objid ("2b166766-b5c1-4af5-9b8e-b374f4a1fe54")
    public static final class MdaTypes {
        @objid ("09cfa9ba-400e-42a1-83cc-fe87a6db5698")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4d807bf9-609b-4580-bfb7-4090bb561be0")
        public static TagType HWROM_ASSOCIATION_TYPE_TAGTYPE_ELT;

        @objid ("7f8e214c-af22-4870-99ea-e7871314e972")
        public static TagType HWROM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT;

        @objid ("ad98e10e-f802-4a08-bc84-0ebb77b9a19e")
        private static Stereotype MDAASSOCDEP;

        @objid ("b4edcb63-22c1-4900-9f2e-26ec63b04c32")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a9fad8b-aa4f-4f72-9927-439fc72eb104")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "484614d2-1009-11df-86fe-0014222a9f79");
            HWROM_ASSOCIATION_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8e1b0cb4-1009-11df-86fe-0014222a9f79");
            HWROM_ASSOCIATION_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8e1b0cb5-1009-11df-86fe-0014222a9f79");
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
