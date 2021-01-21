/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << HwClock_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2fcc956a-1113-4d66-b57e-70e0f21a2bab")
public class HwClockLifeline extends HwTimingResourceLifeline {
    @objid ("99215cb3-73c6-4841-aba5-02bdcdc5c166")
    public static final String STEREOTYPE_NAME = "HwClock_Lifeline";

    @objid ("45164020-4b47-483c-bdf7-d00867c0c468")
    public static final String HWCLOCK_LIFELINE_FREQUENCY_TAGTYPE = "HwClock_Lifeline_frequency";

    /**
     * Tells whether a {@link HwClockLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwClock_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f837315e-a454-41c5-8f7b-38cd25d34a18")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwClock_Lifeline >> then instantiate a {@link HwClockLifeline} proxy.
     * 
     * @return a {@link HwClockLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("50a4dc5c-3f29-4acf-94c0-07afbb607307")
    public static HwClockLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockLifeline.STEREOTYPE_NAME);
        return HwClockLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwClockLifeline} proxy from a {@link Lifeline} stereotyped << HwClock_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwClockLifeline} proxy or <i>null</i>.
     */
    @objid ("5f63fc24-22df-4153-81c5-053bd1dcd9c6")
    public static HwClockLifeline instantiate(final Lifeline obj) {
        return HwClockLifeline.canInstantiate(obj) ? new HwClockLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockLifeline} proxy from a {@link Lifeline} stereotyped << HwClock_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwClockLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9587b745-f3a1-47f0-84b7-7e44e75fbb6a")
    public static HwClockLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwClockLifeline.canInstantiate(obj))
        	return new HwClockLifeline(obj);
        else
        	throw new IllegalArgumentException("HwClockLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4ed84134-e594-4f9d-9419-b9465ae20c14")
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
        HwClockLifeline other = (HwClockLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("b15abe76-09ff-49f4-99b5-6770a200a370")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7c07346-ab37-48d5-b56c-6bfef4ef48ba")
    public String getHwClock_Lifeline_frequency() {
        return this.elt.getTagValue(HwClockLifeline.MdaTypes.HWCLOCK_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("5a0b4e28-5a89-420e-8559-af9a048ab693")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5760b3e-e218-4e27-93bb-ce7ad18a3e71")
    public void setHwClock_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwClockLifeline.MdaTypes.HWCLOCK_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("0103b768-41d8-44b1-a40c-bd8a3fd96075")
    protected HwClockLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("5f858036-3d4e-46ec-8cec-8fa6d9c354cd")
    public static final class MdaTypes {
        @objid ("acbe7fb4-7683-4087-bd4d-6c3c38cfabdb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d7634cb-2050-4a61-8e1c-6469ad3fff34")
        public static TagType HWCLOCK_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        @objid ("9d6b0a8c-9e49-4d33-8c95-8ae93b9de9ff")
        private static Stereotype MDAASSOCDEP;

        @objid ("ee591ac0-48be-48d9-9b51-c85bcd63d95d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("76e9527c-0fd2-4d9c-b0d4-7be7befa0ab8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "61498331-10ae-11df-81d9-0014222a9f79");
            HWCLOCK_LIFELINE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fb28e13d-123c-11df-8f55-0014222a9f79");
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
