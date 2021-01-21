/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << GaCommStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bf3929ac-d93e-4cf4-96e8-ab1cc4e5368d")
public class GaCommStepModelElement extends GaStepModelElement {
    @objid ("02990333-8227-4f93-8e1b-e5b8e78846fe")
    public static final String STEREOTYPE_NAME = "GaCommStep_ModelElement";

    /**
     * Tells whether a {@link GaCommStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaCommStep_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("58e76f4e-e38d-4e34-974d-ac44f1549a40")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaCommStep_ModelElement >> then instantiate a {@link GaCommStepModelElement} proxy.
     * 
     * @return a {@link GaCommStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("590a6777-9742-4b67-aa0a-85f54b95a185")
    public static GaCommStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommStepModelElement.STEREOTYPE_NAME);
        return GaCommStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaCommStepModelElement} proxy from a {@link ModelElement} stereotyped << GaCommStep_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaCommStepModelElement} proxy or <i>null</i>.
     */
    @objid ("674892a3-7dee-48a8-9a93-17d7b9930814")
    public static GaCommStepModelElement instantiate(final ModelElement obj) {
        return GaCommStepModelElement.canInstantiate(obj) ? new GaCommStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommStepModelElement} proxy from a {@link ModelElement} stereotyped << GaCommStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaCommStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a53a63c1-d9d1-42ee-ba46-2439e8a9227c")
    public static GaCommStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaCommStepModelElement.canInstantiate(obj))
        	return new GaCommStepModelElement(obj);
        else
        	throw new IllegalArgumentException("GaCommStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77587409-35a4-437c-b476-f06372ca627d")
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
        GaCommStepModelElement other = (GaCommStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f5bf2a4e-2264-4f2c-8c57-a1c6c537a010")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("108c2b76-d1cc-4eb0-8bac-ca777e79d7e9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a6553e16-e7b6-4fc8-8909-f76ddf306479")
    protected GaCommStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("0ec12a08-12fc-40cc-824f-c25596f92614")
    public static final class MdaTypes {
        @objid ("f9280d77-69b0-4e4e-a313-8abf4422ec98")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7cb4b0f7-e837-48da-b287-a258ad620e40")
        private static Stereotype MDAASSOCDEP;

        @objid ("09fdac25-56f3-4475-a71a-cf446d6a0fe2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a45f73d3-5884-4925-b8bc-37ff338d822f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9faaafa8-14a7-11df-9d54-0014222a9f79");
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
