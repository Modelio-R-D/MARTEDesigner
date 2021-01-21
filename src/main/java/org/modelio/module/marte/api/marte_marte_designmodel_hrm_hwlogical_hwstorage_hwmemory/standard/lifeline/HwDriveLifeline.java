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
 * Proxy class to handle a {@link Lifeline} with << HwDrive_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("183a2da6-19a6-47a4-ad02-5d95a731f655")
public class HwDriveLifeline extends HwMemoryLifeline {
    @objid ("cc71f61e-3229-4136-9aef-c5d2e57ff492")
    public static final String STEREOTYPE_NAME = "HwDrive_Lifeline";

    @objid ("8530b84d-fd22-4f98-bb98-64e043e73a44")
    public static final String HWDRIVE_LIFELINE_BUFFER_TAGTYPE = "HwDrive_Lifeline_buffer";

    @objid ("5d4acd58-4c8f-45cb-b043-8424b8a2d965")
    public static final String HWDRIVE_LIFELINE_SECTORSIZE_TAGTYPE = "HwDrive_Lifeline_sectorSize";

    /**
     * Tells whether a {@link HwDriveLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwDrive_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0763bea5-1344-4952-8e47-ab9eee611e5c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwDrive_Lifeline >> then instantiate a {@link HwDriveLifeline} proxy.
     * 
     * @return a {@link HwDriveLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("e1f9234d-f8fb-4246-82db-48206c76abf1")
    public static HwDriveLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveLifeline.STEREOTYPE_NAME);
        return HwDriveLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveLifeline} proxy from a {@link Lifeline} stereotyped << HwDrive_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwDriveLifeline} proxy or <i>null</i>.
     */
    @objid ("21c1bda8-e40c-44ac-a046-d1fdcc8c68e3")
    public static HwDriveLifeline instantiate(final Lifeline obj) {
        return HwDriveLifeline.canInstantiate(obj) ? new HwDriveLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDriveLifeline} proxy from a {@link Lifeline} stereotyped << HwDrive_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwDriveLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3899997c-b03a-4781-bc9d-45f9eec81b08")
    public static HwDriveLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwDriveLifeline.canInstantiate(obj))
        	return new HwDriveLifeline(obj);
        else
        	throw new IllegalArgumentException("HwDriveLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e15db0b2-9933-4ada-8f55-10456016437d")
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
        HwDriveLifeline other = (HwDriveLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("bc14ddd4-2e86-4301-8a33-e083fda4d608")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Lifeline_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3ba39ddf-cf9b-4b29-afb8-9344bcd7b7f8")
    public String getHwDrive_Lifeline_buffer() {
        return this.elt.getTagValue(HwDriveLifeline.MdaTypes.HWDRIVE_LIFELINE_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Lifeline_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34f043a7-61c1-41ee-b94b-eb7bda572000")
    public String getHwDrive_Lifeline_sectorSize() {
        return this.elt.getTagValue(HwDriveLifeline.MdaTypes.HWDRIVE_LIFELINE_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("f3af36a9-e260-4be0-be1d-ec63c6e11c78")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Lifeline_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28d2c66c-404e-47d0-a4b7-b5c94ec59417")
    public void setHwDrive_Lifeline_buffer(final String value) {
        this.elt.putTagValue(HwDriveLifeline.MdaTypes.HWDRIVE_LIFELINE_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Lifeline_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b6227100-3ed4-40f3-9750-0589e9b48fb6")
    public void setHwDrive_Lifeline_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveLifeline.MdaTypes.HWDRIVE_LIFELINE_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("427f67ca-8fc0-41ac-bfa0-aa7b1ed79307")
    protected HwDriveLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("eb31f7a0-fdd8-49df-afbb-e83908d4b0f2")
    public static final class MdaTypes {
        @objid ("b2e96868-4d5d-43a4-91e3-1b9a0236a4d7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2954d89a-8d41-4f3e-9e43-f9e7599c0c82")
        public static TagType HWDRIVE_LIFELINE_SECTORSIZE_TAGTYPE_ELT;

        @objid ("6d293a2c-8f4a-4320-a3c8-3ca6407fc881")
        public static TagType HWDRIVE_LIFELINE_BUFFER_TAGTYPE_ELT;

        @objid ("f8c68325-c549-43e8-b38f-76f329d35bea")
        private static Stereotype MDAASSOCDEP;

        @objid ("dfe535b2-dcb1-4fe8-8b96-8cfa43bbfec6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("89f276b0-1bb9-4501-87c2-6a22b6a68960")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "faac0979-1009-11df-86fe-0014222a9f79");
            HWDRIVE_LIFELINE_SECTORSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1713f17b-100a-11df-86fe-0014222a9f79");
            HWDRIVE_LIFELINE_BUFFER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1713f17c-100a-11df-86fe-0014222a9f79");
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
