/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwDrive_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwDriveLifeline extends HwMemoryLifeline {
    public static final String STEREOTYPE_NAME = "HwDrive_Lifeline";

    public static final String HWDRIVE_LIFELINE_BUFFER_TAGTYPE = "HwDrive_Lifeline_buffer";

    public static final String HWDRIVE_LIFELINE_SECTORSIZE_TAGTYPE = "HwDrive_Lifeline_sectorSize";

    /**
     * Tells whether a {@link HwDriveLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwDrive_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwDrive_Lifeline >> then instantiate a {@link HwDriveLifeline} proxy.
     * 
     * @return a {@link HwDriveLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwDriveLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveLifeline.STEREOTYPE_NAME);
        return HwDriveLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveLifeline} proxy from a {@link Lifeline} stereotyped << HwDrive_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwDriveLifeline} proxy or <i>null</i>.
     */
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
    public static HwDriveLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwDriveLifeline.canInstantiate(obj))
        	return new HwDriveLifeline(obj);
        else
        	throw new IllegalArgumentException("HwDriveLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwDriveLifeline other = (HwDriveLifeline) obj;
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
     * Getter for string property 'HwDrive_Lifeline_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDrive_Lifeline_buffer() {
        return this.elt.getTagValue(HwDriveLifeline.MdaTypes.HWDRIVE_LIFELINE_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Lifeline_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDrive_Lifeline_sectorSize() {
        return this.elt.getTagValue(HwDriveLifeline.MdaTypes.HWDRIVE_LIFELINE_SECTORSIZE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Lifeline_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDrive_Lifeline_buffer(final String value) {
        this.elt.putTagValue(HwDriveLifeline.MdaTypes.HWDRIVE_LIFELINE_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Lifeline_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDrive_Lifeline_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveLifeline.MdaTypes.HWDRIVE_LIFELINE_SECTORSIZE_TAGTYPE_ELT, value);
    }

    protected HwDriveLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDRIVE_LIFELINE_SECTORSIZE_TAGTYPE_ELT;

        public static TagType HWDRIVE_LIFELINE_BUFFER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
