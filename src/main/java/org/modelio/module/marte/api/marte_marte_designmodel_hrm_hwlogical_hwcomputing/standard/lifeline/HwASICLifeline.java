/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << HwASIC_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e40c0321-f316-4662-8d31-f6adc1891f27")
public class HwASICLifeline extends HwComputingResourceLifeline {
    @objid ("2e98bc01-81ba-4b01-8566-004e226968bf")
    public static final String STEREOTYPE_NAME = "HwASIC_Lifeline";

    /**
     * Tells whether a {@link HwASICLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwASIC_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("58c14f61-d3f3-4da1-911b-d6458fbee1ec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwASIC_Lifeline >> then instantiate a {@link HwASICLifeline} proxy.
     * 
     * @return a {@link HwASICLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("c67d5a54-ed69-4149-8650-7264c06dd3be")
    public static HwASICLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICLifeline.STEREOTYPE_NAME);
        return HwASICLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwASICLifeline} proxy from a {@link Lifeline} stereotyped << HwASIC_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwASICLifeline} proxy or <i>null</i>.
     */
    @objid ("67ffb712-04fd-4b8b-9e78-1057e2059c7d")
    public static HwASICLifeline instantiate(final Lifeline obj) {
        return HwASICLifeline.canInstantiate(obj) ? new HwASICLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwASICLifeline} proxy from a {@link Lifeline} stereotyped << HwASIC_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwASICLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("caed7aa9-03c6-4bea-be88-ee79b666999c")
    public static HwASICLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwASICLifeline.canInstantiate(obj))
        	return new HwASICLifeline(obj);
        else
        	throw new IllegalArgumentException("HwASICLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("08fbaa9c-2a4e-4ebb-9975-824c982bbdc5")
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
        HwASICLifeline other = (HwASICLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("b30056aa-9682-4b52-94e4-b3d787d38b84")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("26278cca-1875-4ce2-b149-844cc69af1d7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("38b6081c-0dd0-4ed5-b568-46e3420b7ccb")
    protected HwASICLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("79852dfa-9092-4b50-a14a-26b6765b5bba")
    public static final class MdaTypes {
        @objid ("07c85fce-eefd-41e1-8a16-80090f50a30a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b5e60bd8-e4a0-478b-b1a1-54a77f2f803d")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e2b335b-bea9-42e4-8581-5c029ccc722a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("62d8d410-326c-4898-9c90-631d187ce422")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b6ae922a-10a3-11df-81d9-0014222a9f79");
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
