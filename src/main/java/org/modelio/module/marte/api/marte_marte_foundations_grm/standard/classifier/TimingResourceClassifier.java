/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << TimingResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fe3c173c-de4c-4ab6-b42f-ee60b4234f5e")
public class TimingResourceClassifier extends ResourceClassifier {
    @objid ("e8b9653f-0ce0-46c2-bd0f-09b8942c1741")
    public static final String STEREOTYPE_NAME = "TimingResource_Classifier";

    /**
     * Tells whether a {@link TimingResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << TimingResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("014c6aec-e8bd-4d91-a282-85d21012d4c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << TimingResource_Classifier >> then instantiate a {@link TimingResourceClassifier} proxy.
     * 
     * @return a {@link TimingResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("50a54668-553c-4d72-bfc1-669d78a4ed0c")
    public static TimingResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceClassifier.STEREOTYPE_NAME);
        return TimingResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link TimingResourceClassifier} proxy from a {@link Classifier} stereotyped << TimingResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link TimingResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("f64f41d7-d6db-45e8-adc9-52ce7bbe44db")
    public static TimingResourceClassifier instantiate(final Classifier obj) {
        return TimingResourceClassifier.canInstantiate(obj) ? new TimingResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimingResourceClassifier} proxy from a {@link Classifier} stereotyped << TimingResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link TimingResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a38c8807-9d55-4588-ad49-3e3c3b8e97cd")
    public static TimingResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (TimingResourceClassifier.canInstantiate(obj))
        	return new TimingResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("TimingResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("72c49a00-3940-48ce-b3a3-80264747a2b9")
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
        TimingResourceClassifier other = (TimingResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("6dee0ad6-2b48-4fdf-a43a-dc821fb6238f")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("9956de98-cf11-4a94-b9db-4e0e4ad640e0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("62624c95-978b-428e-a8e2-84d768e972bb")
    protected TimingResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("0980e4ce-fc4b-4869-90cc-46371e055b57")
    public static final class MdaTypes {
        @objid ("b9f0eacc-9e9f-4c8c-b684-080ec6ab83a4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("741e8f00-6e2d-47a7-884d-122e80cb6ba7")
        private static Stereotype MDAASSOCDEP;

        @objid ("11dffb0d-17f7-49d8-8861-ac162cc4b27c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c2ea4147-dd7e-4980-a20e-8967e2c91c14")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6cde002f-0f4b-11df-8c52-0014222a9f79");
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
