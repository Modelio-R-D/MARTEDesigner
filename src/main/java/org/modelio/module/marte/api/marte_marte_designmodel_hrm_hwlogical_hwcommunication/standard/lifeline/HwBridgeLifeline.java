/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwBridge_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("743e312f-70f4-4913-a28a-ff456b760657")
public class HwBridgeLifeline extends HwMediaLifeline {
    @objid ("a3375d8c-9e32-4274-9785-e6e7ca53aefb")
    public static final String STEREOTYPE_NAME = "HwBridge_Lifeline";

    @objid ("d1ef4c99-60e5-4942-a046-e01ade3ce3d9")
    public static final String HWBRIDGE_LIFELINE_SIDES_TAGTYPE = "HwBridge_Lifeline_sides";

    /**
     * Tells whether a {@link HwBridgeLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwBridge_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("75b713d8-996a-4d5b-aca8-d82f60fabf93")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwBridge_Lifeline >> then instantiate a {@link HwBridgeLifeline} proxy.
     * 
     * @return a {@link HwBridgeLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("f5cf498f-e902-4447-919b-d506f8f0659c")
    public static HwBridgeLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeLifeline.STEREOTYPE_NAME);
        return HwBridgeLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeLifeline} proxy from a {@link Lifeline} stereotyped << HwBridge_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwBridgeLifeline} proxy or <i>null</i>.
     */
    @objid ("56d57b89-5767-44e5-8d9f-38a4543fae6b")
    public static HwBridgeLifeline instantiate(final Lifeline obj) {
        return HwBridgeLifeline.canInstantiate(obj) ? new HwBridgeLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBridgeLifeline} proxy from a {@link Lifeline} stereotyped << HwBridge_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwBridgeLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1674d77a-a1b6-48de-acc5-672cb69143ab")
    public static HwBridgeLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwBridgeLifeline.canInstantiate(obj))
        	return new HwBridgeLifeline(obj);
        else
        	throw new IllegalArgumentException("HwBridgeLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2aa7f3ea-b14f-476a-ae96-f5b94ce79bfe")
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
        HwBridgeLifeline other = (HwBridgeLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("85a24c65-ba61-40b1-9d3a-2eb0914f20b3")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Lifeline_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4ad9f5fa-47a5-44a0-904d-6482172a50f9")
    public List<String> getHwBridge_Lifeline_sides() {
        return this.elt.getTagValues(HwBridgeLifeline.MdaTypes.HWBRIDGE_LIFELINE_SIDES_TAGTYPE_ELT);
    }

    @objid ("a84af754-e2a9-46dc-b055-02ca7dc79f7c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Lifeline_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("12184a80-3369-45be-ab2c-e1061782702c")
    public void setHwBridge_Lifeline_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeLifeline.MdaTypes.HWBRIDGE_LIFELINE_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("faf981d5-3d58-49bd-934e-ea5604cc36c6")
    protected HwBridgeLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("a666ecc6-ee76-4598-bda3-7629752ad04e")
    public static final class MdaTypes {
        @objid ("efbecb22-923e-4ffd-b6f5-df3e700cf735")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d00f0abe-a670-4b70-a955-ace274a54653")
        public static TagType HWBRIDGE_LIFELINE_SIDES_TAGTYPE_ELT;

        @objid ("fc084f3e-5284-4c88-8434-e38032a125be")
        private static Stereotype MDAASSOCDEP;

        @objid ("5994dbe8-f999-4798-9a13-356f45bee306")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87a7511b-9fb6-44d8-81ca-40e7bd2ff16a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e80a4d37-10ac-11df-81d9-0014222a9f79");
            HWBRIDGE_LIFELINE_SIDES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c1039ce4-1726-11df-b92a-0014222a9f79");
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
