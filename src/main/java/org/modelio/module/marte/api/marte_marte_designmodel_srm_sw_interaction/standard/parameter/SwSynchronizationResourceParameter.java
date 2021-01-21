/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwSynchronizationResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7f573d8e-26ba-4c40-a1df-e22f30d42699")
public class SwSynchronizationResourceParameter extends SwInteractionResourceParameter {
    @objid ("186b5c79-1b85-46f2-b736-e257ca530f25")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Parameter";

    /**
     * Tells whether a {@link SwSynchronizationResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwSynchronizationResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("55bb8d1f-c2a5-4b36-a129-6394c65be8c3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwSynchronizationResource_Parameter >> then instantiate a {@link SwSynchronizationResourceParameter} proxy.
     * 
     * @return a {@link SwSynchronizationResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("4fc77cf3-7698-493f-80db-32e37a3916a5")
    public static SwSynchronizationResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceParameter.STEREOTYPE_NAME);
        return SwSynchronizationResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceParameter} proxy from a {@link Parameter} stereotyped << SwSynchronizationResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwSynchronizationResourceParameter} proxy or <i>null</i>.
     */
    @objid ("21986233-830d-4aa3-bb83-6eecfdc394f6")
    public static SwSynchronizationResourceParameter instantiate(final Parameter obj) {
        return SwSynchronizationResourceParameter.canInstantiate(obj) ? new SwSynchronizationResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceParameter} proxy from a {@link Parameter} stereotyped << SwSynchronizationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwSynchronizationResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("04c30ff4-067f-464b-bfde-aac405a4b123")
    public static SwSynchronizationResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceParameter.canInstantiate(obj))
        	return new SwSynchronizationResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("badcd0b2-5055-4017-b039-7b71e468228f")
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
        SwSynchronizationResourceParameter other = (SwSynchronizationResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("bffc4d2a-8af2-4f09-b3f5-6ee46f15eb41")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("0efab648-277b-4c56-a68a-867dd2b8487a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("09860a5a-54d4-4402-b87c-be9c1955f656")
    protected SwSynchronizationResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("2477e443-94d8-4d80-a1fc-449790b8cfce")
    public static final class MdaTypes {
        @objid ("2a36b55e-90ed-4189-9170-513e250a8195")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("06fab1e2-0a6e-4b5f-9f7e-722afd5e5ed7")
        private static Stereotype MDAASSOCDEP;

        @objid ("794c88fd-2a7a-48e2-8662-2198de48ac98")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f3695eab-617c-4352-be6f-c2f93ec85f8f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0217f80e-0ccf-11df-8525-001302895b2b");
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
