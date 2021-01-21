/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << HwSupport_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dc435f1d-f5f0-4f92-91bd-96e5b26545e1")
public class HwSupportLifeline extends HwDeviceLifeline {
    @objid ("fd7bb1fe-cb03-4991-a249-64ccca23daf0")
    public static final String STEREOTYPE_NAME = "HwSupport_Lifeline";

    /**
     * Tells whether a {@link HwSupportLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwSupport_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("301d9955-651e-433a-8fa2-347d5237c3e7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwSupport_Lifeline >> then instantiate a {@link HwSupportLifeline} proxy.
     * 
     * @return a {@link HwSupportLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("5822eec8-4490-4271-8fb5-680599db7081")
    public static HwSupportLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportLifeline.STEREOTYPE_NAME);
        return HwSupportLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportLifeline} proxy from a {@link Lifeline} stereotyped << HwSupport_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwSupportLifeline} proxy or <i>null</i>.
     */
    @objid ("a2a1e7b0-3a17-4952-8d9f-8d61fe7d70c0")
    public static HwSupportLifeline instantiate(final Lifeline obj) {
        return HwSupportLifeline.canInstantiate(obj) ? new HwSupportLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportLifeline} proxy from a {@link Lifeline} stereotyped << HwSupport_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwSupportLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e655fc11-4c24-4be0-bb8e-55a82ababc3a")
    public static HwSupportLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwSupportLifeline.canInstantiate(obj))
        	return new HwSupportLifeline(obj);
        else
        	throw new IllegalArgumentException("HwSupportLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("840b27cf-68ea-4e5a-91ca-5eb3b223d717")
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
        HwSupportLifeline other = (HwSupportLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("1fb5b135-086f-46cf-85e2-fc407efce8cc")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("90facbcd-32da-4a83-bca4-56c02e36ce70")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b4e89ca5-2f21-42e5-8e08-6488039836fa")
    protected HwSupportLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("24761b6d-768b-4783-bfd4-3ddc6c8a54e4")
    public static final class MdaTypes {
        @objid ("e29432b6-428d-4f8b-b094-77c846aed58f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e715e43f-8fdf-4ff0-8b7a-450b29749c82")
        private static Stereotype MDAASSOCDEP;

        @objid ("ca4ac719-d150-4923-b946-fe6debc4ab21")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ccf2a3d1-5e47-48c1-b2d4-258f4b56329c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7901ec8b-10b0-11df-81d9-0014222a9f79");
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
