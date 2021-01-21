/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << DeviceResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b0d440b4-63d3-43ad-9bca-7611257f2f23")
public class DeviceResourceLifeline extends ProcessingResourceLifeline {
    @objid ("a908c54f-a1e7-4ab6-bc11-a0abf8fa4040")
    public static final String STEREOTYPE_NAME = "DeviceResource_Lifeline";

    /**
     * Tells whether a {@link DeviceResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << DeviceResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("21d22e2d-a114-4db2-845b-2d8d85d11646")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << DeviceResource_Lifeline >> then instantiate a {@link DeviceResourceLifeline} proxy.
     * 
     * @return a {@link DeviceResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("c317e24c-789f-45a6-942b-f3a574751dc5")
    public static DeviceResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceLifeline.STEREOTYPE_NAME);
        return DeviceResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceLifeline} proxy from a {@link Lifeline} stereotyped << DeviceResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link DeviceResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("1dcc606f-74b6-4349-b553-8c7c7e671175")
    public static DeviceResourceLifeline instantiate(final Lifeline obj) {
        return DeviceResourceLifeline.canInstantiate(obj) ? new DeviceResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceLifeline} proxy from a {@link Lifeline} stereotyped << DeviceResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link DeviceResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b980a002-ea04-4cd1-93d2-095970a44d14")
    public static DeviceResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (DeviceResourceLifeline.canInstantiate(obj))
        	return new DeviceResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("483e3ebd-4a0e-4227-9ec8-b743dc2b4d93")
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
        DeviceResourceLifeline other = (DeviceResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("dde937cf-282a-4db1-ac83-d764967d1329")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("2b617c9d-9c8d-4c69-a859-c73d44317a4b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ffab4712-36ff-4259-bbb9-7052cfd89493")
    protected DeviceResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("9435f944-3221-4087-b8dc-45343f17b0f2")
    public static final class MdaTypes {
        @objid ("d00a1bdd-05e4-4143-af7f-ea4478366b10")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67d24fa5-17cd-43af-9f59-2e3247be8855")
        private static Stereotype MDAASSOCDEP;

        @objid ("d8cdb4b7-ee9a-44f6-8ba0-febd6571387c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44b6609d-4a9c-44c7-bc24-d8ded7da8c5e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d5-0ccf-11df-8525-001302895b2b");
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
