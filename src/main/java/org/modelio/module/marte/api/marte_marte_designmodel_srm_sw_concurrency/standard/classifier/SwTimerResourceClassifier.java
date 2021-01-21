/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.TimerResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SwTimerResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a1cf86d7-ee8b-4327-b938-dc53eb9dca85")
public class SwTimerResourceClassifier extends TimerResourceClassifier {
    @objid ("f3ef363a-7f43-48fd-a95b-7b0a994aca11")
    public static final String STEREOTYPE_NAME = "SwTimerResource_Classifier";

    /**
     * Tells whether a {@link SwTimerResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwTimerResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ac4946d7-bc5e-4a7d-a4e0-b73cc3e4aa7e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwTimerResource_Classifier >> then instantiate a {@link SwTimerResourceClassifier} proxy.
     * 
     * @return a {@link SwTimerResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("f8186d9a-58ac-47c0-b4d9-0ffda0a1b5d8")
    public static SwTimerResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceClassifier.STEREOTYPE_NAME);
        return SwTimerResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceClassifier} proxy from a {@link Classifier} stereotyped << SwTimerResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwTimerResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("eb55c818-bb01-4acd-8d79-b64c43f8e1e9")
    public static SwTimerResourceClassifier instantiate(final Classifier obj) {
        return SwTimerResourceClassifier.canInstantiate(obj) ? new SwTimerResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceClassifier} proxy from a {@link Classifier} stereotyped << SwTimerResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwTimerResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1031246c-3ddd-4a9f-846b-9f53a5fafa79")
    public static SwTimerResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwTimerResourceClassifier.canInstantiate(obj))
        	return new SwTimerResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0cdaad91-8c9e-41af-a8e9-33a7342b236d")
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
        SwTimerResourceClassifier other = (SwTimerResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("439fd65c-a71c-4727-b879-196f8b526156")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("533c0743-e267-4b59-ba28-aed692e9167c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cfb39a31-c4de-4446-805f-a3e07f53c7d2")
    protected SwTimerResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("ed8e5392-9496-4db8-a409-e70a2c7f89d6")
    public static final class MdaTypes {
        @objid ("92c0f1a7-d492-4c18-8dc2-64ffb1a74a04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b0be02a6-270b-4c84-8573-cb945760ece0")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c6cf19c-f6d2-44c9-89b7-dfdfe31d003c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ee539dfe-07ae-41f7-9909-d43da5eb0803")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ace6d85e-10cf-11df-81d9-0014222a9f79");
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
