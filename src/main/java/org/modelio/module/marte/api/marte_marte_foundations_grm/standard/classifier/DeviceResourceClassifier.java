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
 * Proxy class to handle a {@link Classifier} with << DeviceResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c2ce912e-77d4-430b-ae60-a7e44a2f08ad")
public class DeviceResourceClassifier extends ProcessingResourceClassifier {
    @objid ("fe90f051-bac7-4927-af92-846328694fad")
    public static final String STEREOTYPE_NAME = "DeviceResource_Classifier";

    /**
     * Tells whether a {@link DeviceResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << DeviceResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a9006ad4-0da0-4090-9103-15cea44e69c2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << DeviceResource_Classifier >> then instantiate a {@link DeviceResourceClassifier} proxy.
     * 
     * @return a {@link DeviceResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("d55baa81-9f29-4dea-a090-aef4ef87a1dc")
    public static DeviceResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceClassifier.STEREOTYPE_NAME);
        return DeviceResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceClassifier} proxy from a {@link Classifier} stereotyped << DeviceResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link DeviceResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("8eaffb57-abe3-4708-91ae-aec94089326f")
    public static DeviceResourceClassifier instantiate(final Classifier obj) {
        return DeviceResourceClassifier.canInstantiate(obj) ? new DeviceResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceClassifier} proxy from a {@link Classifier} stereotyped << DeviceResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link DeviceResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7a5ce046-1eb2-44ab-a619-6f9ed6ce5fa9")
    public static DeviceResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (DeviceResourceClassifier.canInstantiate(obj))
        	return new DeviceResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aae53aa3-b690-438c-b90d-d3424771985e")
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
        DeviceResourceClassifier other = (DeviceResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("9312b35d-6dfc-432a-8e35-dff7458c6a55")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("0e85adec-4198-41bd-84b9-f66e1d58a169")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6b9c3114-bf5f-4f25-af11-161ccaabe80f")
    protected DeviceResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("a74caa35-b3b5-48e3-a36d-2c912924d21b")
    public static final class MdaTypes {
        @objid ("3130c613-1ab3-4247-ac9f-69877b8c40fa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7cc5bc3d-7e57-409d-9e9f-27eea96da9c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("51a27274-c47b-4588-b141-1722307d150e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("001a6cb1-1069-475b-9807-a475e46f2819")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d8-0ccf-11df-8525-001302895b2b");
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
