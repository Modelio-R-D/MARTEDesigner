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
 * Proxy class to handle a {@link Lifeline} with << ComputingResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bbd04f77-e457-4a7a-9c0d-97522d722891")
public class ComputingResourceLifeline extends ProcessingResourceLifeline {
    @objid ("18e1796a-df5f-4b5c-9833-5e846ac4d299")
    public static final String STEREOTYPE_NAME = "ComputingResource_Lifeline";

    /**
     * Tells whether a {@link ComputingResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << ComputingResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3386b733-4460-4999-beeb-e26fbdf25b54")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << ComputingResource_Lifeline >> then instantiate a {@link ComputingResourceLifeline} proxy.
     * 
     * @return a {@link ComputingResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("909d5398-e82c-403c-9bf8-833f5fa54572")
    public static ComputingResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceLifeline.STEREOTYPE_NAME);
        return ComputingResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceLifeline} proxy from a {@link Lifeline} stereotyped << ComputingResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link ComputingResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("636e1d1a-9b27-43d3-8ba0-4a0c06ef8ae3")
    public static ComputingResourceLifeline instantiate(final Lifeline obj) {
        return ComputingResourceLifeline.canInstantiate(obj) ? new ComputingResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ComputingResourceLifeline} proxy from a {@link Lifeline} stereotyped << ComputingResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link ComputingResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e060e694-a518-4caf-9f8f-78edc28e775f")
    public static ComputingResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (ComputingResourceLifeline.canInstantiate(obj))
        	return new ComputingResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8342f01b-b7ca-40cd-82f7-8358d794a369")
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
        ComputingResourceLifeline other = (ComputingResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("f324dd54-9acd-4c42-a56b-da91dc3f0c25")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("de6f53c3-2a5a-42c0-872e-abb193268584")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("298733f0-0e52-4136-99e5-449584871eab")
    protected ComputingResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("56e8fd7c-15cb-4b63-99bd-d7ebc42b74b0")
    public static final class MdaTypes {
        @objid ("96eacc4c-704f-4e77-8eb4-fd36b4a9ce01")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d37635c7-1555-428d-bf9b-b94ed4e26fe9")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1db33a4-aa82-45bd-aedd-72c4d6036fa3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f530628-cc6b-4709-830d-d46c141f6891")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "150e67c7-1019-11df-86fe-0014222a9f79");
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