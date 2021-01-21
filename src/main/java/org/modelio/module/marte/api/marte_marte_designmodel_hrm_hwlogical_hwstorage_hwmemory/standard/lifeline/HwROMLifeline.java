/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwROM_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ae5e6441-0c5f-402f-8c81-11a1d23657c3")
public class HwROMLifeline extends HwMemoryLifeline {
    @objid ("b6614947-a43a-49c7-bf9a-d1f912cbe3b9")
    public static final String STEREOTYPE_NAME = "HwROM_Lifeline";

    @objid ("3d909a9f-60fb-48e7-84c1-43bb41ca8a0b")
    public static final String HWROM_LIFELINE_ORGANIZATION_TAGTYPE = "HwROM_Lifeline_organization";

    @objid ("39e9600d-9a78-4ff4-9374-776a3bbdd574")
    public static final String HWROM_LIFELINE_TYPE_TAGTYPE = "HwROM_Lifeline_type";

    /**
     * Tells whether a {@link HwROMLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwROM_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fd2f2798-0102-4f54-9fdc-f473c98db2fc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwROM_Lifeline >> then instantiate a {@link HwROMLifeline} proxy.
     * 
     * @return a {@link HwROMLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("a54f760c-ebbd-4940-9a1c-1959429a13be")
    public static HwROMLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMLifeline.STEREOTYPE_NAME);
        return HwROMLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwROMLifeline} proxy from a {@link Lifeline} stereotyped << HwROM_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwROMLifeline} proxy or <i>null</i>.
     */
    @objid ("294256aa-8757-4129-bd4d-4f871e82b96f")
    public static HwROMLifeline instantiate(final Lifeline obj) {
        return HwROMLifeline.canInstantiate(obj) ? new HwROMLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwROMLifeline} proxy from a {@link Lifeline} stereotyped << HwROM_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwROMLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0d86307c-a086-4759-ae40-c0d8fb3d0354")
    public static HwROMLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwROMLifeline.canInstantiate(obj))
        	return new HwROMLifeline(obj);
        else
        	throw new IllegalArgumentException("HwROMLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fac99263-0213-4fbd-89f0-2c33f74acaa1")
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
        HwROMLifeline other = (HwROMLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("2081e588-cd87-4af7-899b-250dd6846fa7")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Lifeline_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d4bce1ca-4d7e-4a56-960f-0bf69538a9e3")
    public String getHwROM_Lifeline_organization() {
        return this.elt.getTagValue(HwROMLifeline.MdaTypes.HWROM_LIFELINE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a150d75-2210-4350-b259-78a0cf721b46")
    public String getHwROM_Lifeline_type() {
        return this.elt.getTagValue(HwROMLifeline.MdaTypes.HWROM_LIFELINE_TYPE_TAGTYPE_ELT);
    }

    @objid ("8f3a6038-b0d5-4fd1-8587-876b9422265f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Lifeline_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("533245af-8fdf-4e6e-b529-c9bc8a9c455f")
    public void setHwROM_Lifeline_organization(final String value) {
        this.elt.putTagValue(HwROMLifeline.MdaTypes.HWROM_LIFELINE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41d0a152-6e55-42de-a150-94d39cb8a84e")
    public void setHwROM_Lifeline_type(final String value) {
        this.elt.putTagValue(HwROMLifeline.MdaTypes.HWROM_LIFELINE_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("27a7830f-df87-4927-88bb-228c6bb36ed4")
    protected HwROMLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("2ca46ddc-a5e1-4b0a-9bf8-d16d5776eb95")
    public static final class MdaTypes {
        @objid ("e855e7aa-c1f5-433f-84a6-2c762b249bcd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("35dfbba4-33bc-4ab6-8e4e-1700ede1ae89")
        public static TagType HWROM_LIFELINE_TYPE_TAGTYPE_ELT;

        @objid ("510c2b4a-45b1-4256-aa38-6e7acbab551d")
        public static TagType HWROM_LIFELINE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("97ee0045-7a41-45bd-889e-337d4eb32a9a")
        private static Stereotype MDAASSOCDEP;

        @objid ("ab6218f6-0834-4110-9417-89db7fbf0038")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("285b7933-c931-4ff3-80a9-830ac50416f2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "50f691c3-1009-11df-86fe-0014222a9f79");
            HWROM_LIFELINE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8fd68446-1009-11df-86fe-0014222a9f79");
            HWROM_LIFELINE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8fd68447-1009-11df-86fe-0014222a9f79");
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
